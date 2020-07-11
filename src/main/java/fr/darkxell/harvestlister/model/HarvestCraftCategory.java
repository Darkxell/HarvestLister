package fr.darkxell.harvestlister.model;

public enum HarvestCraftCategory {

	AUGMENT("**AUGMENT** :exalt:"),
	REMOVE("**REMOVE** :annulment:"),
	RANDOMISE("**RANDOMISE** :divine:"),
	REMOVE_AUGMENT("**REMOVE+AUGMENT** :annulment: :exalt:"),
	REMOVE_AUGMENT_NON("**REMOVE+AUGMENT NON** :annulment: :exalt: :exclamation:"),
	REFORGE("**REFORGE** :chaos:"),
	ENCHANT("**ENCHANT** :regret:"),
	SOCKET("**SOCKET** :chrome: :jeweller: :fusing:"),
	RESISTANCE("**RESISTANCE SWAPS** :arrows_counterclockwise:"),
	CRAFTS("**OTHER CRAFTS** :mirror:"),

	OTHER("**OTHER** :letouc:");

	public final String displayName;

	private HarvestCraftCategory(String name) {
		this.displayName = name;
	}
}
