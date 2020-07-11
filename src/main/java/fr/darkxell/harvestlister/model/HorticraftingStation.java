package fr.darkxell.harvestlister.model;

import java.util.ArrayList;

public class HorticraftingStation {

	private ArrayList<HarvestCraft> content_crafts = new ArrayList<HarvestCraft>(3);
	private ArrayList<Integer> content_levels = new ArrayList<Integer>(3);
	private ArrayList<String> content_price = new ArrayList<String>(3);

	public int size() {
		return content_crafts.size();
	}

	public void add(HarvestCraft craft, int level) {
		add(craft, level, "unknown");
	}

	public synchronized void add(HarvestCraft craft, int level, String price) {
		content_crafts.add(craft);
		content_levels.add(level);
		content_price.add(price);
	}

	public HarvestCraft getCraft(int i) {
		return content_crafts.get(i);
	}

	public int getLevel(int i) {
		return content_levels.get(i);
	}

	public String getPrice(int i) {
		return content_price.get(i);
	}

}
