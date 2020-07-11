package fr.darkxell.harvestlister;

import fr.darkxell.harvestlister.logic.ParsedPage;

public class Launchable {
	
	public static void main(String[] a) {
		try {
			ParsedPage page = new ParsedPage("ukariukiyonito");
			page.clipboard();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
}
