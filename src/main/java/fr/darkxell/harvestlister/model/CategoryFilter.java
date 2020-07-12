package fr.darkxell.harvestlister.model;

public enum CategoryFilter {

	CATEGORY_DEFAULT((byte) 10, "default"),
	CATEGORY_FINE((byte) 5, "fine"),
	CATEGORY_FINER((byte) 3, "finer"),
	CATEGORY_ALL((byte) 3, "all");

	public final byte level;
	public final String name;

	private CategoryFilter(byte level, String name) {
		this.level = level;
		this.name = name;
	}
}
