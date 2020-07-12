package fr.darkxell.harvestlister;

import fr.darkxell.harvestlister.discordevents.MessageListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Launchable {

	public static void main(String[] a) {
		try {
			JDA builder = JDABuilder.createDefault("---")
					.setActivity(Activity.watching("h! help")).build();
			builder.addEventListener(new MessageListener());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
