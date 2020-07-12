package fr.darkxell.harvestlister.model;

public enum HarvestCraftCategory {

	AUGMENT("**AUGMENT** :exalt:",CategoryFilter.CATEGORY_DEFAULT),
	REMOVE("**REMOVE** :annulment:",CategoryFilter.CATEGORY_DEFAULT),
	RANDOMISE("**RANDOMISE** :divine:",CategoryFilter.CATEGORY_FINE),
	REMOVE_AUGMENT("**REMOVE+AUGMENT** :annulment: :exalt:",CategoryFilter.CATEGORY_DEFAULT),
	REMOVE_AUGMENT_NON("**REMOVE+AUGMENT NON** :annulment: :exalt: :exclamation:",CategoryFilter.CATEGORY_FINE),
	REFORGE("**REFORGE** :chaos:",CategoryFilter.CATEGORY_FINER),
	ENCHANT("**ENCHANT** :regret:",CategoryFilter.CATEGORY_DEFAULT),
	SOCKET("**SOCKET** :chrome: :jeweller: :fusing:",CategoryFilter.CATEGORY_FINE),
	RESISTANCE("**RESISTANCE SWAPS** :arrows_counterclockwise:",CategoryFilter.CATEGORY_FINE),
	CRAFTS("**OTHER CRAFTS** :mirror:",CategoryFilter.CATEGORY_DEFAULT),

	OTHER("**OTHER** :letouc:",CategoryFilter.CATEGORY_DEFAULT);

	public final String displayName;
	public final CategoryFilter filter;
	
	private HarvestCraftCategory(String name, CategoryFilter filter) {
		this.displayName = name;
		this.filter = filter;
	}
}
