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

	/**
	 * Gets a clean human readable print of this parsed page. The output is ready to
	 * be pasted in a discord channel.
	 */
	@Override
	public String toString() {
		StringBuilder toreturn = new StringBuilder();
		// Counts the shit
		HashMap<HarvestCraft, Integer> counter = new HashMap<HarvestCraft, Integer>(250);
		for (HorticraftingStation station : stations)
			for (int i = 0; i < station.size(); i++)
				counter.put(station.getCraft(i), new Integer(
						counter.containsKey(station.getCraft(i)) ? counter.get(station.getCraft(i)) + 1 : 1));
		// Prints the shit in some random "good" order
		boolean pa = false;
		pa = pa | appendCategory(counter, HarvestCraftCategory.AUGMENT, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.REMOVE, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.RANDOMISE, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.REMOVE_AUGMENT, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.REMOVE_AUGMENT_NON, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.REFORGE, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.ENCHANT, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.SOCKET, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.RESISTANCE, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.CRAFTS, toreturn);
		pa = pa | appendCategory(counter, HarvestCraftCategory.OTHER, toreturn);

		if (!pa) {
			toreturn.append(
					"Literally nothing for sale here... Are you online?\nMaybe this is me, check out yourself: https://poe.trade/search/"
							+ poeTradeID);
		}

		if (unknowns.size() >= 1)
			toreturn.append(getUnknowns());

		if (elecount >= 99)
			toreturn.append("\n And maybe more, more than 100 stations were found!");

		return toreturn.toString();
	}

	/** @return True if this appended at least one line. */
	private static boolean appendCategory(HashMap<HarvestCraft, Integer> counter, HarvestCraftCategory category,
			StringBuilder output) {
		boolean header = false;
		for (HarvestCraft key : counter.keySet())
			if (key.category == category && !key.hidden) {
				if (!header) {
					header = true;
					output.append("\n\n" + category.displayName + "\n");
				}
				output.append("\n[x" + counter.get(key) + "] " + key.description_alias);
			}
		return header;
	}

	public String getUnknowns() {
		StringBuilder toreturn = new StringBuilder();
		toreturn.append("\n\nError! There are unrecognised crafts available too: ");
		for (int i = 0; i < unknowns.size(); i++) {
			toreturn.append("\n");
			toreturn.append(unknowns.get(i));
		}
		return toreturn.toString();
	}

	/** Calls this.toString() and puts the content to your clipboard. */
	@Deprecated
	public String clipboard() {
		String clip = this.toString();
		StringSelection stringSelection = new StringSelection(clip);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		return clip;
	}

}
