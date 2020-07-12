package fr.darkxell.harvestlister.logic;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import fr.darkxell.harvestlister.model.CategoryFilter;
import fr.darkxell.harvestlister.model.HarvestCraft;
import fr.darkxell.harvestlister.model.HarvestCraftCategory;
import fr.darkxell.harvestlister.model.HorticraftingStation;

public class ParsedPage {

	private ArrayList<HorticraftingStation> stations = new ArrayList<HorticraftingStation>();
	public final String poeTradeID;
	private ArrayList<String> unknowns = new ArrayList<String>(10);
	private int elecount = 0;

	public ParsedPage(String poeTradeID) throws Exception {
		this.poeTradeID = poeTradeID;
		String url = "https://poe.trade/search/" + poeTradeID;
		Document doc = Jsoup.connect(url).get();
		Elements items = doc.select("tbody[class^=item]");

		for (Element element : items)
			try {
				elecount++;
				if (!element.attr("data-name").equals("Horticrafting Station"))
					continue;
				Elements mods = element.select("ul[class^=mods]").select("li");
				HorticraftingStation station = new HorticraftingStation();
				for (Element mod : mods) {
					String modstring = mod.text().trim();
					if (modstring.startsWith("Stores a limited number of Harvest"))
						continue;
					if (modstring.startsWith("crafted"))
						modstring = modstring.substring(7);
					int level = 0;
					if (modstring.endsWith(")")) {
						String[] splitstring = modstring.split("\\(");
						modstring = splitstring[0].trim();
						level = Integer.parseInt(splitstring[1].replaceAll("\\)", "").trim());
					}
					HarvestCraft craft = HarvestCraft.findCraft(modstring);
					if (craft != HarvestCraft.UNKNOWN)
						station.add(craft, level);
					else
						unknowns.add(modstring);
				}
				this.stations.add(station);
			} catch (Exception e) {
				System.err.println("Skipped an item in the parsed list due to an error:");
				e.printStackTrace();
			}
	}

	public ArrayList<String> toStringArray(CategoryFilter maxFilter) {
		// Counts the shit
		HashMap<HarvestCraft, Integer> counter = new HashMap<HarvestCraft, Integer>(250);
		for (HorticraftingStation station : stations)
			for (int i = 0; i < station.size(); i++)
				counter.put(station.getCraft(i), new Integer(
						counter.containsKey(station.getCraft(i)) ? counter.get(station.getCraft(i)) + 1 : 1));
		// Prints the shit in some random "good" order
		ArrayList<String> toreturn = new ArrayList<String>(10);
		boolean once = false;
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.AUGMENT, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.REMOVE, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.REMOVE_AUGMENT, maxFilter), toreturn);
		once = once
				| arrayAppend(computeCategory(counter, HarvestCraftCategory.REMOVE_AUGMENT_NON, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.RANDOMISE, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.REFORGE, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.ENCHANT, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.SOCKET, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.RESISTANCE, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.CRAFTS, maxFilter), toreturn);
		once = once | arrayAppend(computeCategory(counter, HarvestCraftCategory.OTHER, maxFilter), toreturn);

		if (!once) {
			toreturn = new ArrayList<String>(1);
			toreturn.add("Literally nothing for sale here... Are you online?\n"
					+ "Maybe this is me, check out yourself: https://poe.trade/search/" + poeTradeID);
			return toreturn;
		}

		if (unknowns.size() >= 1)
			toreturn.add(getUnknowns());

		if (elecount >= 99)
			toreturn.set(toreturn.size() - 1,
					toreturn.get(toreturn.size() - 1) + "\n And maybe more, more than 100 stations were found!");

		return toreturn;
	}

	private boolean arrayAppend(String element, ArrayList<String> array) {
		if (element == null)
			return false;
		array.add(element);
		return true;
	}

	/**
	 * @return null if there's nothing in this category, otherwise a human readable
	 *         String
	 * @param showhidden True if you want to include hidden crafts. Hidden crafts
	 *                   are the extreme low value and these that can't be traded.
	 *                   Should probably be false by default.
	 */
	private static String computeCategory(HashMap<HarvestCraft, Integer> counter, HarvestCraftCategory category,
			CategoryFilter filter) {
		if (category.filter.level < filter.level)
			return null;
		StringBuilder builder = new StringBuilder();
		boolean header = false;
		for (HarvestCraft key : counter.keySet())
			if (key.category == category && (!key.hidden || filter == CategoryFilter.CATEGORY_ALL)) {
				if (!header) {
					header = true;
					builder.append("\n\n" + category.displayName);
				}
				builder.append("\n[x" + counter.get(key) + "] " + key.description_alias);
			}
		return header ? builder.toString() : null;
	}

	private String getUnknowns() {
		StringBuilder toreturn = new StringBuilder();
		toreturn.append("\n\n**Error!** There are unrecognised crafts available too: ");
		for (int i = 0; i < unknowns.size(); i++) {
			toreturn.append("\n");
			toreturn.append(unknowns.get(i));
		}
		return toreturn.toString();
	}

	/**
	 * Gets a clean human readable print of this parsed page. The output is ready to
	 * be pasted in a discord channel.<br/>
	 * This method uses <code>CategoryFilter.CATEGORY_FINER</code> filter, lisling
	 * all crafts that can be traded.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		ArrayList<String> cat = this.toStringArray(CategoryFilter.CATEGORY_FINER);
		for (String c : cat)
			builder.append(c);
		return builder.toString();
	}

	/**
	 * Calls <code>this.toString()</code> and puts the content to your clipboard.
	 * 
	 * @deprecated Use the discord bot instead.
	 */
	@Deprecated
	public String clipboard() {
		String clip = this.toString();
		StringSelection stringSelection = new StringSelection(clip);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		return clip;
	}

}
