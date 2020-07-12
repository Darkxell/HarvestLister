package fr.darkxell.harvestlister.discordevents;

import fr.darkxell.harvestlister.discordevents.command.CommandHelp;
import fr.darkxell.harvestlister.discordevents.command.CommandList;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/** Simple message dispatcher. */
public class MessageListener extends ListenerAdapter {

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		DiscordBotCommand command = null;
		// Creates a new command object for the given string
		if (event.getMessage().getContentRaw().startsWith("h! list")) {
			command = new CommandList();
		} else if (event.getMessage().getContentRaw().startsWith("h! help")) {
			command = new CommandHelp();
		}
		// Processes the command, or prints an error message if it wasn't recognized.
		if (command != null) {
			command.process(event);
		} else if (event.getMessage().getContentRaw().startsWith("h!")) {
			event.getChannel().sendMessage("@" + event.getAuthor().getAsTag()
					+ " This doesn't seem to be a valid command.\nTry this:\n```h! help```").queue();
		}

	}

}
