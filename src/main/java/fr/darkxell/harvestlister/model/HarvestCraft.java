package fr.darkxell.harvestlister.model;

public enum HarvestCraft {

	UNKNOWN(HarvestCraftCategory.OTHER, "Unknown", "Unknown craft", true),

	// CASTER
	UPGRADE_CASTER(HarvestCraftCategory.OTHER, "Regal including a Caster mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Caster modifier", true),
	REFORGE_CASTER(HarvestCraftCategory.REFORGE, "Caster", "Reforge a Rare item with new random modifiers, including a Caster modifier", true),
	REMOVE_ADD_NON_CASTER(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Caster", "Remove a random non-Caster modifier from an item and add a new Caster modifier"),
	AUGMENT_CASTER(HarvestCraftCategory.AUGMENT, "Caster", "Augment a Magic or Rare item with a new Caster modifier"),
	REMOVE_CASTER(HarvestCraftCategory.REMOVE, "Caster", "Remove a random Caster modifier from an item"),
	RANDOMISE_CASTER(HarvestCraftCategory.RANDOMISE, "Caster", "Randomise the numeric values of the random Caster modifiers on a Magic or Rare item"),
	REMOVE_ADD_CASTER(HarvestCraftCategory.REMOVE_AUGMENT, "Caster", "Remove a random Caster modifier from an item and add a new Caster modifier"),
	REFORGE_COMMON_CASTER(HarvestCraftCategory.REFORGE, "Caster", "Reforge a Rare item with new random modifiers, including a Caster modifier. Caster modifiers are more common", true),
	AUGMENT_LUCKY_CASTER(HarvestCraftCategory.AUGMENT, "Caster lucky", "Augment a Magic or Rare item with a new Caster modifier with Lucky values"),

	// PHYSICAL
	UPGRADE_PHYSICAL(HarvestCraftCategory.OTHER, "Regal including a Physical mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Physical modifier", true),
	REFORGE_PHYSICAL(HarvestCraftCategory.REFORGE, "Physical", "Reforge a Rare item with new random modifiers, including a Physical modifier", true),
	REMOVE_ADD_NON_PHYSICAL(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Physical", "Remove a random non-Physical modifier from an item and add a new Physical modifier"),
	AUGMENT_PHYSICAL(HarvestCraftCategory.AUGMENT, "Physical", "Augment a Magic or Rare item with a new Physical modifier"),
	REMOVE_PHYSICAL(HarvestCraftCategory.REMOVE, "Physical", "Remove a random Physical modifier from an item"),
	RANDOMISE_PHYSICAL(HarvestCraftCategory.RANDOMISE, "Physical", "Randomise the numeric values of the random Physical modifiers on a Magic or Rare item"),
	REMOVE_ADD_PHYSICAL(HarvestCraftCategory.REMOVE_AUGMENT, "Physical", "Remove a random Physical modifier from an item and add a new Physical modifier"),
	REFORGE_COMMON_PHYSICAL(HarvestCraftCategory.REFORGE, "Physical", "Reforge a Rare item with new random modifiers, including a Physical modifier. Physical modifiers are more common", true),
	AUGMENT_LUCKY_PHYSICAL(HarvestCraftCategory.AUGMENT, "Physical lucky", "Augment a Magic or Rare item with a new Physical modifier with Lucky values"),

	// FIRE
	UPGRADE_FIRE(HarvestCraftCategory.OTHER, "Regal including a Fire mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Fire modifier", true),
	REFORGE_FIRE(HarvestCraftCategory.REFORGE, "Fire", "Reforge a Rare item with new random modifiers, including a Fire modifier", true),
	REMOVE_ADD_NON_FIRE(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Fire", "Remove a random non-Fire modifier from an item and add a new Fire modifier"),
	AUGMENT_FIRE(HarvestCraftCategory.AUGMENT, "Fire", "Augment a Magic or Rare item with a new Fire modifier"),
	REMOVE_FIRE(HarvestCraftCategory.REMOVE, "Fire", "Remove a random Fire modifier from an item"),
	RANDOMISE_FIRE(HarvestCraftCategory.RANDOMISE, "Fire", "Randomise the numeric values of the random Fire modifiers on a Magic or Rare item"),
	REMOVE_ADD_FIRE(HarvestCraftCategory.REMOVE_AUGMENT, "Fire", "Remove a random Fire modifier from an item and add a new Fire modifier"),
	REFORGE_COMMON_FIRE(HarvestCraftCategory.REFORGE, "Fire", "Reforge a Rare item with new random modifiers, including a Fire modifier. Fire modifiers are more common", true),
	AUGMENT_LUCKY_FIRE(HarvestCraftCategory.AUGMENT, "Fire lucky", "Augment a Magic or Rare item with a new Fire modifier with Lucky values"),

	// ATTACK
	UPGRADE_ATTACK(HarvestCraftCategory.OTHER, "Regal including an Attack mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Attack modifier", true),
	REFORGE_ATTACK(HarvestCraftCategory.REFORGE, "Attack", "Reforge a Rare item with new random modifiers, including a Attack modifier", true),
	REMOVE_ADD_NON_ATTACK(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Attack", "Remove a random non-Attack modifier from an item and add a new Attack modifier"),
	AUGMENT_ATTACK(HarvestCraftCategory.AUGMENT, "Attack", "Augment an item with a new Attack modifier"),
	REMOVE_ATTACK(HarvestCraftCategory.REMOVE, "Attack", "Remove a random Attack modifier from an item"),
	RANDOMISE_ATTACK(HarvestCraftCategory.RANDOMISE, "Attack", "Randomise the numeric values of the random Attack modifiers on a Magic or Rare item"),
	REMOVE_ADD_ATTACK(HarvestCraftCategory.REMOVE_AUGMENT, "Attack", "Remove a random Attack modifier from an item and add a new Attack modifier"),
	REFORGE_COMMON_ATTACK(HarvestCraftCategory.REFORGE, "Attack", "Reforge a Rare item with new random modifiers, including a Attack modifier. Attack modifiers are more common", true),
	AUGMENT_LUCKY_ATTACK(HarvestCraftCategory.AUGMENT, "Attack lucky", "Augment an item with a new Attack modifier with Lucky values"),

	// LIFE
	UPGRADE_LIFE(HarvestCraftCategory.OTHER, "Regal including a Life mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Life modifier", true),
	REFORGE_LIFE(HarvestCraftCategory.REFORGE, "Life", "Reforge a Rare item with new random modifiers, including a Life modifier", true),
	REMOVE_ADD_NON_LIFE(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Life", "Remove a random non-Life modifier from an item and add a new Life modifier"),
	AUGMENT_LIFE(HarvestCraftCategory.AUGMENT, "Life", "Augment an item with a new Life modifier"),
	REMOVE_LIFE(HarvestCraftCategory.REMOVE, "Life", "Remove a random Life modifier from an item"),
	RANDOMISE_LIFE(HarvestCraftCategory.RANDOMISE, "Life", "Randomise the numeric values of the random Life modifiers on a Magic or Rare item"),
	REMOVE_ADD_LIFE(HarvestCraftCategory.REMOVE_AUGMENT, "Life", "Remove a random Life modifier from an item and add a new Life modifier"),
	REFORGE_COMMON_LIFE(HarvestCraftCategory.REFORGE, "Life", "Reforge a Rare item with new random modifiers, including a Life modifier. Life modifiers are more common", true),
	AUGMENT_LUCKY_LIFE(HarvestCraftCategory.AUGMENT, "Life lucky", "Augment an item with a new Life modifier with Lucky values"),

	// COLD
	UPGRADE_COLD(HarvestCraftCategory.OTHER, "Regal including a Cold mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Cold modifier", true),
	REFORGE_COLD(HarvestCraftCategory.REFORGE, "Cold", "Reforge a Rare item with new random modifiers, including a Cold modifier", true),
	REMOVE_ADD_NON_COLD(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Cold", "Remove a random non-Cold modifier from an item and add a new Cold modifier"),
	AUGMENT_COLD(HarvestCraftCategory.AUGMENT, "Cold", "Augment an item with a new Cold modifier"),
	REMOVE_COLD(HarvestCraftCategory.REMOVE, "Cold", "Remove a random Cold modifier from an item"),
	RANDOMISE_COLD(HarvestCraftCategory.RANDOMISE, "Cold", "Randomise the numeric values of the random Cold modifiers on a Magic or Rare item"),
	REMOVE_ADD_COLD(HarvestCraftCategory.REMOVE_AUGMENT, "Cold", "Remove a random Cold modifier from an item and add a new Cold modifier"),
	REFORGE_COMMON_COLD(HarvestCraftCategory.REFORGE, "Cold", "Reforge a Rare item with new random modifiers, including a Cold modifier. Cold modifiers are more common", true),
	AUGMENT_LUCKY_COLD(HarvestCraftCategory.AUGMENT, "Cold lucky", "Augment an item with a new Cold modifier with Lucky values"),

	// SPEED
	UPGRADE_SPEED(HarvestCraftCategory.OTHER, "Regal including a Speed mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Speed modifier", true),
	REFORGE_SPEED(HarvestCraftCategory.REFORGE, "Speed", "Reforge a Rare item with new random modifiers, including a Speed modifier", true),
	REMOVE_ADD_NON_SPEED(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Speed", "Remove a random non-Speed modifier from an item and add a new Speed modifier"),
	AUGMENT_SPEED(HarvestCraftCategory.AUGMENT, "Speed", "Augment an item with a new Speed modifier"),
	REMOVE_SPEED(HarvestCraftCategory.REMOVE, "Speed", "Remove a random Speed modifier from an item"),
	RANDOMISE_SPEED(HarvestCraftCategory.RANDOMISE, "Speed", "Randomise the numeric values of the random Speed modifiers on a Magic or Rare item"),
	REMOVE_ADD_SPEED(HarvestCraftCategory.REMOVE_AUGMENT, "Speed", "Remove a random Speed modifier from an item and add a new Speed modifier"),
	REFORGE_COMMON_SPEED(HarvestCraftCategory.REFORGE, "Speed", "Reforge a Rare item with new random modifiers, including a Speed modifier. Speed modifiers are more common", true),
	AUGMENT_LUCKY_SPEED(HarvestCraftCategory.AUGMENT, "Speed lucky", "Augment an item with a new Speed modifier with Lucky values"),

	// DEFENCE
	UPGRADE_DEFENCE(HarvestCraftCategory.OTHER, "Regal including a Defence mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Defence modifier", true),
	REFORGE_DEFENCE(HarvestCraftCategory.REFORGE, "Defence", "Reforge a Rare item with new random modifiers, including a Defence modifier", true),
	REMOVE_ADD_NON_DEFENCE(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Defence", "Remove a random non-Defence modifier from an item and add a new Defence modifier"),
	AUGMENT_DEFENCE(HarvestCraftCategory.AUGMENT, "Defence", "Augment an item with a new Defence modifier"),
	REMOVE_DEFENCE(HarvestCraftCategory.REMOVE, "Defence", "Remove a random Defence modifier from an item"),
	RANDOMISE_DEFENCE(HarvestCraftCategory.RANDOMISE, "Defence", "Randomise the numeric values of the random Defence modifiers on a Magic or Rare item"),
	REMOVE_ADD_DEFENCE(HarvestCraftCategory.REMOVE_AUGMENT, "Defence", "Remove a random Defence modifier from an item and add a new Defence modifier"),
	REFORGE_COMMON_DEFENCE(HarvestCraftCategory.REFORGE, "Defence", "Reforge a Rare item with new random modifiers, including a Defence modifier. Defence modifiers are more common", true),
	AUGMENT_LUCKY_DEFENCE(HarvestCraftCategory.AUGMENT, "Defence lucky", "Augment an item with a new Defence modifier with Lucky values"),

	// LIGHTNING
	UPGRADE_LIGHTNING(HarvestCraftCategory.OTHER, "Regal including a Lightning mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Lightning modifier", true),
	REFORGE_LIGHTNING(HarvestCraftCategory.REFORGE, "Lightning", "Reforge a Rare item with new random modifiers, including a Lightning modifier", true),
	REMOVE_ADD_NON_LIGHTNING(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Lightning", "Remove a random non-Lightning modifier from an item and add a new Lightning modifier"),
	AUGMENT_LIGHTNING(HarvestCraftCategory.AUGMENT, "Lightning", "Augment an item with a new Lightning modifier"),
	REMOVE_LIGHTNING(HarvestCraftCategory.REMOVE, "Lightning", "Remove a random Lightning modifier from an item"),
	RANDOMISE_LIGHTNING(HarvestCraftCategory.RANDOMISE, "Lightning", "Randomise the numeric values of the random Lightning modifiers on a Magic or Rare item"),
	REMOVE_ADD_LIGHTNING(HarvestCraftCategory.REMOVE_AUGMENT, "Lightning", "Remove a random Lightning modifier from an item and add a new Lightning modifier"),
	REFORGE_COMMON_LIGHTNING(HarvestCraftCategory.REFORGE, "Lightning", "Reforge a Rare item with new random modifiers, including a Lightning modifier. Lightning modifiers are more common", true),
	AUGMENT_LUCKY_LIGHTNING(HarvestCraftCategory.AUGMENT, "Lightning lucky", "Augment an item with a new Lightning modifier with Lucky values"),

	// CHAOS
	UPGRADE_CHAOS(HarvestCraftCategory.OTHER, "Regal including a Chaos mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Chaos modifier", true),
	REFORGE_CHAOS(HarvestCraftCategory.REFORGE, "Chaos", "Reforge a Rare item with new random modifiers, including a Chaos modifier", true),
	REMOVE_ADD_NON_CHAOS(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Chaos", "Remove a random non-Chaos modifier from an item and add a new Chaos modifier"),
	AUGMENT_CHAOS(HarvestCraftCategory.AUGMENT, "Chaos", "Augment an item with a new Chaos modifier"),
	REMOVE_CHAOS(HarvestCraftCategory.REMOVE, "Chaos", "Remove a random Chaos modifier from an item"),
	RANDOMISE_CHAOS(HarvestCraftCategory.RANDOMISE, "Chaos", "Randomise the numeric values of the random Chaos modifiers on a Magic or Rare item"),
	REMOVE_ADD_CHAOS(HarvestCraftCategory.REMOVE_AUGMENT, "Chaos", "Remove a random Chaos modifier from an item and add a new Chaos modifier"),
	REFORGE_COMMON_CHAOS(HarvestCraftCategory.REFORGE, "Chaos", "Reforge a Rare item with new random modifiers, including a Chaos modifier. Chaos modifiers are more common", true),
	AUGMENT_LUCKY_CHAOS(HarvestCraftCategory.AUGMENT, "Chaos lucky", "Augment an item with a new Chaos modifier with Lucky values"),

	// CRITICAL
	UPGRADE_CRITICAL(HarvestCraftCategory.OTHER, "Regal including a Critical mod", "Reforge a Normal or Magic item as a Rare item with random modifiers, including a Critical modifier"),
	REFORGE_CRITICAL(HarvestCraftCategory.REFORGE, "Critical", "Reforge a Rare item with new random modifiers, including a Critical modifier"),
	REMOVE_ADD_NON_CRITICAL(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Critical", "Remove a random non-Critical modifier from an item and add a new Critical modifier"),
	AUGMENT_CRITICAL(HarvestCraftCategory.AUGMENT, "Critical", "Augment an item with a new Critical modifier"),
	REMOVE_CRITICAL(HarvestCraftCategory.REMOVE, "Critical", "Remove a random Critical modifier from an item"),
	RANDOMISE_CRITICAL(HarvestCraftCategory.RANDOMISE, "Critical", "Randomise the numeric values of the random Critical modifiers on a Magic or Rare item"),
	REMOVE_ADD_CRITICAL(HarvestCraftCategory.REMOVE_AUGMENT, "Critical", "Remove a random Critical modifier from an item and add a new Critical modifier"),
	REFORGE_COMMON_CRITICAL(HarvestCraftCategory.REFORGE, "Critical", "Reforge a Rare item with new random modifiers, including a Critical modifier. Critical modifiers are more common"),
	AUGMENT_LUCKY_CRITICAL(HarvestCraftCategory.AUGMENT, "Critical lucky", "Augment an item with a new Critical modifier with lucky values"),

	// INFLUENCE
	REMOVE_ADD_NON_INFLUENCE(HarvestCraftCategory.REMOVE_AUGMENT_NON, "Influence", "Remove a random non-Influence modifier from an item and add a new Influence modifier"),
	AUGMENT_INFLUENCE(HarvestCraftCategory.AUGMENT, "Influence", "Augment an item with a new Influence modifier"),
	REMOVE_INFLUENCE(HarvestCraftCategory.REMOVE, "Influence", "Remove a random Influence modifier from an item"),
	REMOVE_ADD_INFLUENCE(HarvestCraftCategory.REMOVE_AUGMENT, "Influence", "Remove a random Influence modifier from an item and add a new Influence modifier"),
	REFORGE_COMMON_INFLUENCE(HarvestCraftCategory.REFORGE, "Influence", "Reforge a Rare item with new random modifiers, including an Influence modifier. Influence modifiers are more common"),
	AUGMENT_LUCKY_INFLUENCE(HarvestCraftCategory.AUGMENT, "Influence lucky", "Augment an item with a new Influence modifier with Lucky values"),
	ADD_INFLUENCE_WEAPON(HarvestCraftCategory.OTHER, "Add Influence to Weapon", "Add a random Influence to a Normal, Magic or Rare Weapon that isn't influenced"),
	ADD_INFLUENCE_ARMOUR(HarvestCraftCategory.OTHER, "Add Influence to Armour", "Add a random Influence to Normal, Magic or Rare Armour that isn't influenced"),
	ADD_INFLUENCE_JEWELLERY(HarvestCraftCategory.OTHER, "Add Influence to Jewellery", "Add a random Influence to Normal, Magic or Rare Jewellery that isn't influenced"),

	// SOCKET
	SOCKET_BLUE(HarvestCraftCategory.SOCKET, "non blue to blue", "Reforge the colour of a non-Blue socket on an item, turning it Blue"),
	SOCKET_RED(HarvestCraftCategory.SOCKET, "non red to red", "Reforge the colour of a non-Red socket on an item, turning it Red"),
	SOCKET_GREEN(HarvestCraftCategory.SOCKET, "non green to green", "Reforge the colour of a non-Green socket on an item, turning it Green"),
	SOCKET_WHITE(HarvestCraftCategory.SOCKET, "non white to white", "Reforge the colour of a non-White socket on an item, turning it White"),
	SOCKET_WHITE_RANDOM(HarvestCraftCategory.SOCKET, "random to white", "Reforge the colour of a random socket on an item, turning it White"),
	SOCKET_RB(HarvestCraftCategory.SOCKET, "random to Red-Blue", "Reforge the colour of two random sockets on an item, turning them Red and Blue", true),
	SOCKET_RG(HarvestCraftCategory.SOCKET, "random to Red-Green", "Reforge the colour of two random sockets on an item, turning them Red and Green", true),
	SOCKET_BG(HarvestCraftCategory.SOCKET, "random to Blue-Green", "Reforge the colour of two random sockets on an item, turning them Blue and Green", true),
	SOCKET_RGB(HarvestCraftCategory.SOCKET, "random to Red-Blue-Green", "Reforge the colour of three random sockets on an item, turning them Red, Green and Blue", true),
	SOCKET_NUMBER_ROLL10(HarvestCraftCategory.SOCKET, "Reforge sockets 10 times", "Reforge the number of sockets on an item 10 times, using the outcome with the greatest number of sockets", true),
	SOCKET_LINKS_ROLL10(HarvestCraftCategory.SOCKET, "Reforge links 10 times", "Reforge the links between sockets on an item 10 times, using the outcome with the greatest number of linked sockets", true),
	SOCKET_COLOURS_ROLL10(HarvestCraftCategory.SOCKET, "Reforge colours 10 times", "Reforge the colours of sockets on an item 10 times, using the outcome with the greatest number of less-common socket colours", true),
	SOCKET_NUMBER_3(HarvestCraftCategory.SOCKET, "Set 3 sockets", "Set an item to three sockets", true),
	SOCKET_NUMBER_4(HarvestCraftCategory.SOCKET, "Set 4 sockets", "Set an item to four sockets", true),
	SOCKET_NUMBER_5(HarvestCraftCategory.SOCKET, "Set 5 sockets", "Set an item to five sockets", true),
	SOCKET_NUMBER_6(HarvestCraftCategory.SOCKET, "Set 6 sockets", "Set an item to six sockets"),
	SOCKET_LINKS_3(HarvestCraftCategory.SOCKET, "Set 3 Links", "Reforge the links between sockets on an item, linking three sockets", true),
	SOCKET_LINKS_4(HarvestCraftCategory.SOCKET, "Set 4 links", "Reforge the links between sockets on an item, linking four sockets", true),
	SOCKET_LINKS_5(HarvestCraftCategory.SOCKET, "Set 5 links", "Reforge the links between sockets on an item, linking five sockets"),
	SOCKET_LINKS_6(HarvestCraftCategory.SOCKET, "Set 6 links", "Reforge the links between sockets on an item, linking six sockets"),

	// CURRENCY
	QUALITY_FLASK_10(HarvestCraftCategory.OTHER, "Quality flask 10%", "Improves the Quality of a Flask by at least 10%. Has greater effect on lower rarity flasks. The maximum quality is 20%", true),
	QUALITY_GEM_10(HarvestCraftCategory.OTHER, "Quality gem 10%", "Improves the Quality of a Gem by at least 10%. The maximum quality is 20%", true),
	CHANCE_ROLL10(HarvestCraftCategory.OTHER, "Chance 10 times", "Upgrades a Normal Item to a random rarity 10 times, using the outcome with the highest rarity", true),
	CHAOS_ROLL10(HarvestCraftCategory.OTHER, "Chaos 10 times", "Reforges a Rare item with new random modifiers 10 times, using the outcome with the highest average modifier level", true),

	// RESISTANCE SWAPS
	RESISTANCE_SWAP_FIRE_COLD(HarvestCraftCategory.RESISTANCE, "Swap Fire to Cold res", "Change a modifier that grants Fire Resistance into a similar-tier modifier that grants Cold Resistance"),
	RESISTANCE_SWAP_COLD_LIGHTNING(HarvestCraftCategory.RESISTANCE, "Swap Cold to Lightning res", "Change a modifier that grants Cold Resistance into a similar-tier modifier that grants Lightning Resistance"),
	RESISTANCE_SWAP_LIGHTNING_FIRE(HarvestCraftCategory.RESISTANCE, "Swap Lightning to Fire res", "Change a modifier that grants Lightning Resistance into a similar-tier modifier that grants Fire Resistance"),
	RESISTANCE_SWAP_FIRE_LIGHTNING(HarvestCraftCategory.RESISTANCE, "Swap Fire to Lightning res", "Change a modifier that grants Fire Resistance into a similar-tier modifier that grants Lightning Resistance"),
	RESISTANCE_SWAP_COLD_FIRE(HarvestCraftCategory.RESISTANCE, "Swap Cold to Fire res", "Change a modifier that grants Cold Resistance into a similar-tier modifier that grants Fire Resistance"),
	RESISTANCE_SWAP_LIGHTNING_COLD(HarvestCraftCategory.RESISTANCE, "Swap Lightning to Cold res", "Change a modifier that grants Lightning Resistance into a similar-tier modifier that grants Cold Resistance"),

	// EXCHANGES
	EXCHANGE_CHAOS_DIVINE(HarvestCraftCategory.OTHER, "Exchange 3 Chaos Orbs for a Divine Orb", true),
	EXCHANGE_TRANSMUTATION_ALCHEMY(HarvestCraftCategory.OTHER, "Exchange 3 Orbs of Transmutation for 3 Orbs of Alchemy", true),
	EXCHANGE_BLESSED_ALTERATION(HarvestCraftCategory.OTHER, "Exchange 3 Blessed Orbs for 6 Orbs of Alteration", true),
	EXCHANGE_ALCHEMY_CHISEL(HarvestCraftCategory.OTHER, "Exchange 3 Orbs of Alchemy for 6 Cartographer's Chisels", true),
	EXCHANGE_CHROMATIC_GEMCUTTER(HarvestCraftCategory.OTHER, "Exchange 3 Chromatic Orbs for 6 Gemcutter's Prisms", true),
	EXCHANGE_JEWELLER_FUSING(HarvestCraftCategory.OTHER, "Exchange 3 Jeweller's Orbs for 6 Orbs of Fusing", true),
	EXCHANGE_AUGMENTATION_REGAL(HarvestCraftCategory.OTHER, "Exchange 3 Orbs of Augmentation for 3 Regal Orbs", true),
	EXCHANGE_WISDOM_CHANCE(HarvestCraftCategory.OTHER, "Exchange 3 Scrolls of Wisdom for 6 Orbs of Chance", true),
	EXCHANGE_SIMPLE_PRIME(HarvestCraftCategory.OTHER, "Exchange 3 Simple Sextants for 3 Prime Sextants", true),
	EXCHANGE_PRIME_AWAKENED(HarvestCraftCategory.OTHER, "Exchange 3 Prime Sextants for 3 Awakened Sextants", true),
	EXCHANGE_SCOURING_ANNULMENT(HarvestCraftCategory.OTHER, "Exchange 3 Orbs of Scouring for 3 Orbs of Annulment", true),
	EXCHANGE_ALTERATION_CHAOS(HarvestCraftCategory.OTHER, "Exchange 3 Orbs of Alteration for 3 Chaos Orbs", true),
	EXCHANGE_VAAL_REGRET(HarvestCraftCategory.OTHER, "Exchange 3 Vaal Orbs for 6 Orbs of Regret", true),
	EXCHANGE_CHISEL_VAAL(HarvestCraftCategory.OTHER, "Exchange 3 Cartographer's Chisels for 3 Vaal Orbs", true),
	EXCHANGE_FOSSIL(HarvestCraftCategory.OTHER, "Change a stack of Fossils into a different type of Fossil", true),
	EXCHANGE_ESSENCE(HarvestCraftCategory.OTHER, "Change a stack of Essences into a different type of the same tier", true),
	EXCHANGE_DELIRIUM(HarvestCraftCategory.OTHER, "Change a stack of Delirium Orbs into a different type of Delirium Orb", true),
	EXCHANGE_OIL(HarvestCraftCategory.OTHER, "Change a stack of Oils into a different colour of Oil", true),
	EXCHANGE_CATALYST(HarvestCraftCategory.OTHER, "Change a stack of Catalysts into a different type of Catalyst", true),
	EXCHANGE_10_EXALTED(HarvestCraftCategory.OTHER, "Exchange 10 Chaos Orbs for an Exalted Orb", true),
	EXCHANGE_10_ALCHEMY(HarvestCraftCategory.OTHER, "Exchange 10 Orbs of Transmutation for 10 Orbs of Alchemy", true),
	EXCHANGE_10_ALTERATION(HarvestCraftCategory.OTHER, "Exchange 10 Blessed Orbs for 20 Orbs of Alteration", true),
	EXCHANGE_10_CHISEL(HarvestCraftCategory.OTHER, "Exchange 10 Orbs of Alchemy for 20 Cartographer's Chisels", true),
	EXCHANGE_10_GEMCUTTER(HarvestCraftCategory.OTHER, "Exchange 10 Chromatic Orbs for 20 Gemcutter's Prisms", true),
	EXCHANGE_10_FUSING(HarvestCraftCategory.OTHER, "Exchange 10 Jeweller's Orbs for 20 Orbs of Fusing", true),
	EXCHANGE_10_REGAL(HarvestCraftCategory.OTHER, "Exchange 10 Orbs of Augmentation for 10 Regal Orbs", true),
	EXCHANGE_10_CHANCE(HarvestCraftCategory.OTHER, "Exchange 10 Scrolls of Wisdom for 20 Orbs of Chance", true),
	EXCHANGE_10_PRIME(HarvestCraftCategory.OTHER, "Exchange 10 Simple Sextants for 10 Prime Sextants", true),
	EXCHANGE_10_AWAKENED(HarvestCraftCategory.OTHER, "Exchange 10 Prime Sextants for 10 Awakened Sextants", true),
	EXCHANGE_10_ANNULMENT(HarvestCraftCategory.OTHER, "Exchange 10 Orbs of Scouring for 10 Orbs of Annulment", true),
	EXCHANGE_10_CHAOS(HarvestCraftCategory.OTHER, "Exchange 10 Orbs of Alteration for 10 Chaos Orbs", true),
	EXCHANGE_10_REGRET(HarvestCraftCategory.OTHER, "Exchange 10 Vaal Orbs for 20 Orbs of Regret", true),
	EXCHANGE_10_VAAL(HarvestCraftCategory.OTHER, "Exchange 10 Cartographer's Chisels for 10 Vaal Orbs", true),
	EXCHANGE_UPGRADE_ESSENCE(HarvestCraftCategory.OTHER, "Upgrade 1 essence tier", "Upgrade the tier of an Essence"),
	EXCHANGE_UPGRADE_FOSSIL(HarvestCraftCategory.OTHER, "Exchange a fossil or resonator", "Exchange a Resonator for a Fossil or vice versa. Rare outcomes are more likely with rare inputs"),
	EXCHANGE_UPGRADE_OIL(HarvestCraftCategory.OTHER, "Upgrade 1 oil tier", "Upgrade an Oil into an Oil one tier higher"),
	EXCHANGE_UPGRADE_ENGINEER(HarvestCraftCategory.OTHER, "Upgrade Engineer's orb", "Upgrade an Engineer's Orb to an Infused Engineer's Orb"),
	EXCHANGE_SCARAB(HarvestCraftCategory.OTHER, "Swap scarab, same rarity", "Change a Scarab to another Scarab of the same rarity"),
	EXCHANGE_UPGRADE_SCARAB(HarvestCraftCategory.OTHER, "Upgrade scarab, possible winged", "Attempt to upgrade a Scarab, with a chance for it to become Winged"),
	EXCHANGE_SPLIT_SCARAB(HarvestCraftCategory.OTHER, "Split scarab", "Split a Scarab into two Scarabs of lower rarity"),
	EXCHANGE_LAB_TRIBUTE(HarvestCraftCategory.OTHER, "Tribute to the goddess", "Change an Offering to the Goddess into a Tribute to the Goddess"),
	EXCHANGE_LAB_GIFT(HarvestCraftCategory.OTHER, "Gift to the goddess", "Change an Offering to the Goddess into a Gift to the Goddess"),
	EXCHANGE_LAB_DEDICATION(HarvestCraftCategory.OTHER, "Dedication to the godess", "Change an Offering to the Goddess into a Dedication to the Goddess"),
	EXCHANGE_UNIQUE(HarvestCraftCategory.OTHER, "Change a Unique item into another random Unique item", true),
	EXCHANGE_UNIQUE_WEAPON(HarvestCraftCategory.OTHER, "Change a Unique into a random Unique Weapon", true),
	EXCHANGE_UNIQUE_ARMOUR(HarvestCraftCategory.OTHER, "Change a Unique into a random Unique Armour", true),
	EXCHANGE_UNIQUE_JEWELRY(HarvestCraftCategory.OTHER, "Change a Unique into a random Unique Ring, Amulet or Belt", true),
	EXCHANGE_UNIQUE_WEAPON_TYPE(HarvestCraftCategory.OTHER, "Change a Unique Weapon into another Unique Weapon of that weapon type", true),
	EXCHANGE_UNIQUE_ARMOUR_TYPE(HarvestCraftCategory.OTHER, "Change a Unique Armour into another Unique Armour of that type", true),
	EXCHANGE_UNIQUE_JEWELRY_TYPE(HarvestCraftCategory.OTHER, "Change a Unique Ring, Amulet or Belt into another Unique item of that type", true),
	EXCHANGE_UNIQUE_JEWEL(HarvestCraftCategory.OTHER, "Change a Unique Jewel into another Unique Jewel", true),
	EXCHANGE_DIVINATION_RANDOM(HarvestCraftCategory.OTHER, "Change a Divination Card into another random Divination Card", true),
	EXCHANGE_DIVINATION_DOUBLE(HarvestCraftCategory.OTHER, "0 to double divination card", "Sacrifice up to half a stack of Divination Cards to receive between 0 and twice that amount of the same Card"),
	EXCHANGE_DIVINATION_MANY(HarvestCraftCategory.OTHER, "Sacrifice a stack of Divination Cards for that many different Divination Cards", true),
	EXCHANGE_FRAGMENT_ATZIRI(HarvestCraftCategory.OTHER, "Exchange sacrifice/mortal fragment", "Change a Sacrifice or Mortal Fragment into another random Fragment of that type"),
	EXCHANGE_FRAGMENT_SHAPER(HarvestCraftCategory.OTHER, "Exchange shaper fragment", "Change a Shaper Fragment into another random Shaper Fragment"),
	EXCHANGE_FRAGMENT_ELDER(HarvestCraftCategory.OTHER, "Exchange elder fragment", "Change an Elder Fragment into another random Elder Fragment of that type"),
	ECHANGE_PALE(HarvestCraftCategory.OTHER, "Exchange pale court fragment", "Change a Pale Court Key into another random Pale Court Key", true),
	ECHANGE_BREACH(HarvestCraftCategory.OTHER, "Exchange breachstone or splinters", "Change a stack of Breach Splinters or a Breachstone into Splinters or a Breachstone of another type"),
	ECHANGE_LEGION(HarvestCraftCategory.OTHER, "Exchange emblem or splinters", "Change a stack of Timeless Splinters or a Timeless Emblem into Splinters or an Emblem of another type"),
	ECHANGE_PERANDUS(HarvestCraftCategory.OTHER, "Exchange unique into perandus coins", "Change a Unique Item into Perandus Coins. Rarer Unique Items are worth more Perandus Coins"),
	ECHANGE_BESTIARYLURE(HarvestCraftCategory.OTHER, "Exchange bestiary item for lure", "Change a Unique Bestiary item or item with an Aspect into Lures of the same beast family"),
	ECHANGE_HARBINGER(HarvestCraftCategory.OTHER, "Change Harbinger unique or piece to Beachhead", "Change a Harbinger Unique or Unique Piece into a random Beachhead Map"),

	// MAP
	MAP_ZANAMOD_RANDOM(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free craft to your Map device", true),
	MAP_ZANAMOD_INFUSED_ANARCHY(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free Infused Anarchy craft to your Map device", true),
	MAP_ZANAMOD_INFUSED_NEMESIS(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free Infused Nemesis craft to your Map device", true),
	MAP_ZANAMOD_INFUSED_DOMINATION(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free Infused Domination craft to your Map device", true),
	MAP_ZANAMOD_INFUSED_BLOODLINES(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free Infused Bloodlines craft to your Map device", true),
	MAP_ZANAMOD_INFUSED_RAMPAGE(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free Infused Rampage craft to your Map device", true),
	MAP_ZANAMOD_INFUSED_AMBUSH(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free Infused Ambush craft to your Map device", true),
	MAP_ZANAMOD_INFUSED_HARBINGER(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free Infused Harbinger craft to your Map device", true),
	MAP_ZANAMOD_INFUSED_PERANDUS(HarvestCraftCategory.OTHER, "Sacrifice a Map. Add a free Infused Perandus craft to your Map device", true),
	MAP_MISSION_ALVA(HarvestCraftCategory.OTHER, "Sacrifice a Map to gain 3 Alva Atlas Missions", true),
	MAP_MISSION_NIKO(HarvestCraftCategory.OTHER, "Sacrifice a Map to gain 3 Niko Atlas Missions", true),
	MAP_MISSION_EINHAR(HarvestCraftCategory.OTHER, "Sacrifice a Map to gain 3 Einhar Atlas Missions", true),
	MAP_MISSION_JUN(HarvestCraftCategory.OTHER, "Sacrifice a Map to gain 3 Jun Atlas Missions", true),
	MAP_MISSION_ZANA(HarvestCraftCategory.OTHER, "Sacrifice a Map to gain 3 Zana Atlas Missions", true),
	MAP_MISSION_ALL(HarvestCraftCategory.OTHER, "Sacrifice a Map to gain 1 Atlas Mission for each Master", true),
	MAP_SACRIFICE_YELLOW_FRAGMENTS(HarvestCraftCategory.OTHER, "Sacrifice a White or Yellow Map to create random Map Fragments based on its tier", true),
	MAP_SACRIFICE_RED_FRAGMENTS(HarvestCraftCategory.OTHER, "Sacrifice red map for fragments", "Sacrifice a Red Map to create random Map Fragments based on its tier"),
	MAP_SACRIFICE(HarvestCraftCategory.OTHER, "Sacrifice map for map currency", "Sacrifice a Map to create random Map currency based on its tier"),
	MAP_SACRIFICE_SCARAB(HarvestCraftCategory.OTHER, "Sacrifice map for scarab", "Sacrifice a Map to create a random Scarab based on its colour"),
	MAP_SACRIFICE_ELDER(HarvestCraftCategory.OTHER, "Sacrifice map for elder guardian", "Sacrifice a tier 14 map or higher to create a random Elder Guardian-occupied Map"),
	MAP_SACRIFICE_SHAPER(HarvestCraftCategory.OTHER, "Sacrifice map for shaper guardian", "Sacrifice a tier 14 map or higher to create a random Shaper Guardian-occupied Map"),
	MAP_SACRIFICE_SYNTHESIS(HarvestCraftCategory.OTHER, "Sacrifice map for synthesis map", "Sacrifice a tier 14 map or higher to create a random Unique Synthesis Map"),
	MAP_CHANGE_UNCOMPLETE(HarvestCraftCategory.OTHER, "Change a Map into another of the same tier, prioritising Maps that you have not yet completed", true),
	MAP_CHANGE_LOWER(HarvestCraftCategory.OTHER, "Sacrifice a Map for multiple Maps one tier lower", true),
	MAP_CHANGE_CORRUPTED(HarvestCraftCategory.OTHER, "Sacrifice a Corrupted Map. Create a new Corrupted Map of the same tier and rarity.", true),

	// COMPLEX CRAFING
	CRAFT_REROLL_KEEP_PREFIXES(HarvestCraftCategory.CRAFTS, "Reforge, keep prefixes", "Reforge a Rare item, keeping all Prefixes"),
	CRAFT_REROLL_KEEP_SUFFIXES(HarvestCraftCategory.CRAFTS, "Reforge, keep suffixes", "Reforge a Rare item, keeping all Suffixes"),
	CRAFT_REROLL_KEEP_PREFIXES_LUCKY(HarvestCraftCategory.CRAFTS, "Reforge lucky, keep prefixes", "Reforge a Rare item with Lucky modifier values, keeping all Prefixes"),
	CRAFT_REROLL_KEEP_SUFFIXES_LUCKY(HarvestCraftCategory.CRAFTS, "Reforge lucky, keep suffixes", "Reforge a Rare item with Lucky modifier values, keeping all Suffixes"),
	CRAFT_REROLL_DIFFERENT(HarvestCraftCategory.CRAFTS, "Reforge, same modifier types", "Reforge a Rare item, being much less likely to receive the same modifier types"),
	CRAFT_REROLL_SAME(HarvestCraftCategory.CRAFTS, "Reforge, different modifier types", "Reforge a Rare item, being much more likely to receive the same modifier types"),
	CRAFT_SWAP_WEAPONARMOUR_BELT(HarvestCraftCategory.CRAFTS, "Sacrifice WA for a belt", "Sacrifice a Weapon or Armour to create a Belt with similar modifiers"),
	CRAFT_SWAP_WEAPONARMOUR_RING(HarvestCraftCategory.CRAFTS, "Sacrifice WA for a ring", "Sacrifice a Weapon or Armour to create a Ring with similar modifiers"),
	CRAFT_SWAP_WEAPONARMOUR_AMULET(HarvestCraftCategory.CRAFTS, "Sacrifice WA for a amulet", "Sacrifice a Weapon or Armour to create an Amulet with similar modifiers"),
	CRAFT_SWAP_WEAPONARMOUR_JEWEL(HarvestCraftCategory.CRAFTS, "Sacrifice WA for a jewel", "Sacrifice a Weapon or Armour to create a Jewel with similar modifiers"),
	CRAFT_SYNTHESIS(HarvestCraftCategory.CRAFTS, "Synthesis implicits", "Synthesise an item, giving random Synthesised implicits. Cannot be used on Unique, Influenced, Synthesised or Fractured items"),
	CRAFT_UPGRADE_DOUBLE(HarvestCraftCategory.CRAFTS, "Upgrade magic, 2 mods", "Upgrade a Magic item to a Rare item, adding two random modifiers"),
	CRAFT_UPGRADE_TRIPLE(HarvestCraftCategory.CRAFTS, "Upgrade magic, 3 mods", "Upgrade a Magic item to a Rare item, adding three random modifiers"),
	CRAFT_UPGRADE_QUADRUPLE(HarvestCraftCategory.CRAFTS, "Upgrade magic, 4 mods", "Upgrade a Magic item to a Rare item, adding four random modifiers"),
	CRAFT_UPGRADE_HIGH_MAGIC(HarvestCraftCategory.CRAFTS, "Upgrade normal, 1 high tier", "Upgrade a Normal item to a Magic item, adding one random high-tier modifier"),
	CRAFT_UPGRADE_HIGH_DOUBLE_MAGIC(HarvestCraftCategory.CRAFTS, "Upgrade normal, 2 high tiers", "Upgrade a Normal item to a Magic item, adding two random high-tier modifiers"),
	CRAFT_UPGRADE_HIGH_DOUBLE(HarvestCraftCategory.CRAFTS, "Upgrade magic, 2 t1 mods", "Upgrade a Magic item to a Rare item, adding two random high-tier modifiers"),
	CRAFT_UPGRADE_HIGH_TRIPLE(HarvestCraftCategory.CRAFTS, "Upgrade magic, 3 t1 mods", "Upgrade a Magic item to a Rare item, adding three random high-tier modifiers"),
	CRAFT_UPGRADE_HIGH_QUADRUPLE(HarvestCraftCategory.CRAFTS, "Upgrade magic, 4 t1 mods", "Upgrade a Magic item to a Rare item, adding four random high-tier modifiers"),
	CRAFT_DIVINE_PREFIXES(HarvestCraftCategory.CRAFTS, "Divine prefixes", "Reroll the values of Prefix modifiers on a Magic or Rare item, with Lucky modifier values"),
	CRAFT_DIVINE_SUFFIXES(HarvestCraftCategory.CRAFTS, "Divine suffixes", "Reroll the values of Suffix modifiers on a Magic or Rare item, with Lucky modifier values"),
	CRAFT_DIVINE_LUCKY(HarvestCraftCategory.CRAFTS, "Divine lucky", "Reroll the values of Prefix, Suffix and Implicit modifiers on a Rare item, with Lucky modifier values"),
	CRAFT_EXALTED_LUCKY(HarvestCraftCategory.CRAFTS, "Exalt lucky", "Augment a Rare item with a new modifier, with Lucky modifier values"),

	// ENCHANTS
	ENCHANT_CRITICAL(HarvestCraftCategory.ENCHANT, "Enchant weapon: crit", "Enchant a Weapon. Quality does not increase its Physical Damage, has 1% increased Critical Strike Chance per 4% Quality"),
	ENCHANT_ACCURACY(HarvestCraftCategory.ENCHANT, "Enchant weapon: accuracy", "Enchant a Weapon. Quality does not increase its Physical Damage, grants 1% increased Accuracy per 2% Quality"),
	ENCHANT_ATTACKSPEED(HarvestCraftCategory.ENCHANT, "Enchant weapon: attack speed", "Enchant a Weapon. Quality does not increase its Physical Damage, has 1% increased Attack Speed per 8% Quality"),
	ENCHANT_WEAPONRANGE(HarvestCraftCategory.ENCHANT, "Enchant weapon: weapon range", "Enchant a Melee Weapon. Quality does not increase its Physical Damage, has +1 Weapon Range per 10% Quality"),
	ENCHANT_ELEMENTALDAMAGE(HarvestCraftCategory.ENCHANT, "Enchant weapon: ele damage", "Enchant a Weapon. Quality does not increase its Physical Damage, grants 1% increased Elemental Damage per 2% Quality"),
	ENCHANT_AREAOFEFFECT(HarvestCraftCategory.ENCHANT, "Enchant weapon: AOE", "Enchant a Weapon. Quality does not increase its Physical Damage, grants 1% increased Area of Effect per 4% Quality"),
	ENCHANT_FLASK_DURATION(HarvestCraftCategory.ENCHANT, "Enchant flask: duration", "Enchant a Flask with a modifier that increases its Duration. The magnitude of this effect decreases with each use"),
	ENCHANT_FLASK_EFFECT(HarvestCraftCategory.ENCHANT, "Enchant flask: effect", "Enchant a Flask with a modifier that increases its Effect. The magnitude of this effect decreases with each use"),
	ENCHANT_FLASK_MAXCHARGES(HarvestCraftCategory.ENCHANT, "Enchant flask: max charges", "Enchant a Flask with a modifier that increases its Maximum Charges. The magnitude of this effect decreases with each use"),
	ENCHANT_FLASK_USEDCHARGES(HarvestCraftCategory.ENCHANT, "Enchant flask: charges used", "Enchant a Flask with a modifier that reduces its Charges used. The magnitude of this effect decreases with each use"),
	ENCHANT_MAP_ZANA(HarvestCraftCategory.ENCHANT, "Enchant map: zana modifier", "Enchant a non-Unique Map with \"Has an additional modifier from Zana's crafting bench at random\""),
	ENCHANT_MAP_SEXTANT(HarvestCraftCategory.ENCHANT, "Enchant map: no sextant use", "Enchant a non-Unique Map with \"Map doesn't consume Sextant charges\""),
	ENCHANT_MAP_VAAL(HarvestCraftCategory.ENCHANT, "Enchant map: vaal side area", "Enchant a non-Unique Map with \"Map has a Vaal Side Area\""),
	ENCHANT_MAP_TORMENT(HarvestCraftCategory.ENCHANT, "Enchant map: tormented boss", "Enchant a non-Unique Map with \"Map boss is surrounded by Tormented Spirits\""),
	EHCHANT_ARMOUR_LIFE(HarvestCraftCategory.ENCHANT, "Enchant armour: life", "Enchant Body Armour. Quality does not increase its Defences, grants +1 Maximum Life per 2% quality"),
	EHCHANT_ARMOUR_MANA(HarvestCraftCategory.ENCHANT, "Enchant armour: mana", "Enchant Body Armour. Quality does not increase its Defences, grants +1 Maximum Mana per 2% quality"),
	EHCHANT_ARMOUR_STRENGTH(HarvestCraftCategory.ENCHANT, "Enchant armour: strength", "Enchant Body Armour. Quality does not increase its Defences, grants +1 Strength per 2% quality"),
	EHCHANT_ARMOUR_DEXTERITY(HarvestCraftCategory.ENCHANT, "Enchant armour: dexterity", "Enchant Body Armour. Quality does not increase its Defences, grants +1 Dexterity per 2% quality"),
	EHCHANT_ARMOUR_INTELLIGENCE(HarvestCraftCategory.ENCHANT, "Enchant armour: intelligence", "Enchant Body Armour. Quality does not increase its Defences, grants +1 Intelligence per 2% quality"),
	EHCHANT_ARMOUR_FIRERES(HarvestCraftCategory.ENCHANT, "Enchant armour: fire res", "Enchant Body Armour. Quality does not increase its Defences, grants 1% Fire Resistance per 2% quality"),
	EHCHANT_ARMOUR_COLDRES(HarvestCraftCategory.ENCHANT, "Enchant armour: cold res", "Enchant Body Armour. Quality does not increase its Defences, grants 1% Cold Resistance per 2% quality"),
	EHCHANT_ARMOUR_LIGHTRES(HarvestCraftCategory.ENCHANT, "Enchant armour: lightning res", "Enchant Body Armour. Quality does not increase its Defences, grants 1% Lightning Resistance per 2% quality"),

	// FRACTURE
	FRACTURE_5(HarvestCraftCategory.OTHER, "Fracture in 5 mods", "Fracture a random modifier on an item with at least 5 modifiers, locking it in place. This can't be used on Influenced, Synthesised, or Fractured items"),
	FRACTURE_SUFFIX(HarvestCraftCategory.OTHER, "Fracture a suffix", "Fracture a random Suffix on an item with least 3 Suffixes. This can't be used on Influenced, Synthesised, or Fractured items"),
	FRACTURE_PREFIX(HarvestCraftCategory.OTHER, "Fracture a prefix", "Fracture a random Prefix on an item with at least 3 Prefixes. This can't be used on Influenced, Synthesised, or Fractured items."),

	// GEM
	GEM_SWAP(HarvestCraftCategory.OTHER, "Gem swap, keep quality and xp", "Change a Gem into another Gem, carrying over experience and quality if possible"),
	GEM_QUALITY_20(HarvestCraftCategory.OTHER, "Gem: 20% as gcp", "Sacrifice a Corrupted Gem to gain 20% of the gem's quality as Gemcutter's Prisms", true),
	GEM_QUALITY_30(HarvestCraftCategory.OTHER, "Gem: 30% as gcp", "Sacrifice a Corrupted Gem to gain 30% of the gem's quality as Gemcutter's Prisms", true),
	GEM_QUALITY_40(HarvestCraftCategory.OTHER, "Gem: 40% as gcp", "Sacrifice a Corrupted Gem to gain 40% of the gem's quality as Gemcutter's Prisms", true),
	GEM_QUALITY_50(HarvestCraftCategory.OTHER, "Gem: 50% as gcp", "Sacrifice a Corrupted Gem to gain 50% of the gem's quality as Gemcutter's Prisms", true),
	GEM_XP_20(HarvestCraftCategory.OTHER, "Facetor's lens: 20% as xp", "Sacrifice a Corrupted Gem to gain 20% of the gem's total experience stored as a Facetor's Lens"),
	GEM_XP_30(HarvestCraftCategory.OTHER, "Facetor's lens: 30% as xp", "Sacrifice a Corrupted Gem to gain 30% of the gem's total experience stored as a Facetor's Lens"),
	GEM_XP_40(HarvestCraftCategory.OTHER, "Facetor's lens: 40% as xp", "Sacrifice a Corrupted Gem to gain 40% of the gem's total experience stored as a Facetor's Lens"),
	GEM_XP_50(HarvestCraftCategory.OTHER, "Facetor's lens: 50% as xp", "Sacrifice a Corrupted Gem to gain 50% of the gem's total experience stored as a Facetor's Lens"),
	GEM_AWAKEN(HarvestCraftCategory.OTHER, "5% chance to awaken a gem", "Attempt to Awaken a level 20 Support Gem that can be Awakened with a 5% chance. If it does not Awaken, it is destroyed."),

	// IMPLICITS
	IMPLICIT_JEWEL_REGULAR(HarvestCraftCategory.OTHER, "Jewel implicit: Cobalt, Crimson, Viridian or Prismatic", "Set a new Implicit modifier on a Cobalt, Crimson, Viridian or Prismatic Jewel"),
	IMPLICIT_JEWEL_ABYSS(HarvestCraftCategory.OTHER, "Jewel implicit: Abyss or timeless", "Set a new Implicit modifier on an Abyss Jewel or Timeless Jewel"),
	IMPLICIT_JEWEL_CLUSTER(HarvestCraftCategory.OTHER, "Jewel implicit: cluster", "Set a new Implicit modifier on a Cluster Jewel");

	/** Description of the craft, as seen in game. In English only. */
	public final String description;
	public final String description_alias;
	/**
	 * True if this is a low value craft and should be hidden in the listings. The
	 * crafts that can't be traded are considered low value for this.
	 */
	public final boolean hidden;

	public final HarvestCraftCategory category;

	private HarvestCraft(HarvestCraftCategory category, String alias, String description) {
		this.category = category;
		this.description = description;
		this.description_alias = alias;
		this.hidden = false;
	}

	private HarvestCraft(HarvestCraftCategory category, String description, boolean hide) {
		this.category = category;
		this.description = description;
		this.description_alias = description;
		this.hidden = hide;
	}

	private HarvestCraft(HarvestCraftCategory category, String alias, String description, boolean hide) {
		this.category = category;
		this.description = description;
		this.description_alias = alias;
		this.hidden = hide;
	}

	@Override
	public String toString() {
		return this.description;
	}

	public static HarvestCraft findCraft(String description) {
		for (HarvestCraft craft : HarvestCraft.values())
			if (craft.description.equals(description))
				return craft;
		return UNKNOWN;
	}

}
