package fr.darkxell.harvestlister.discordevents.command;

import fr.darkxell.harvestlister.discordevents.DiscordBotCommand;
import fr.darkxell.harvestlister.logic.ParsedPage;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CommandList extends DiscordBotCommand {

	@Override
	public void process(MessageReceivedEvent event) {
		String m = event.getMessage().getContentRaw();
		MessageChannel channel = event.getChannel();

		String[] split = m.split(" ");
		if (split.length >= 3) {
			try {
				System.out.println("Parsing page: \"" + split[2] + "\" for user " + event.getAuthor().getAsTag());
				ParsedPage page = new ParsedPage(split[2]);
				channel.sendMessage(page.toString()).queue();
			} catch (Exception e) {
				channel.sendMessage("@Darkxell#1655\nYour bot's boken, dude. Error details:\n" + e.getClass() + "\n"
						+ e.getLocalizedMessage()).queue();
			}
		} else {
			channel.sendMessage("@" + event.getAuthor().getAsTag()
					+ " This doesn't seem to be a valid command.\nTry this:\n```h! list <poe.trade search id>```")
					.queue();
		}
	}

}
