package fr.darkxell.harvestlister.discordevents;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public abstract class DiscordBotCommand {

	public abstract void process(MessageReceivedEvent event) ;
	
}
