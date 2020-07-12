package fr.darkxell.harvestlister.discordevents.command;

import java.util.ArrayList;

import fr.darkxell.harvestlister.discordevents.DiscordBotCommand;
import fr.darkxell.harvestlister.logic.ParsedPage;
import fr.darkxell.harvestlister.model.CategoryFilter;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CommandList extends DiscordBotCommand {

	@Override
	public void process(MessageReceivedEvent event) {
		String m = event.getMessage().getContentRaw();
		MessageChannel channel = event.getChannel();

		String[] split = m.split(" ");
		if (split.length == 3) {
			sendParsedPage(split[2], CategoryFilter.CATEGORY_DEFAULT, channel);
		} else if (split.length == 4) {
			String grain = split[3];
			boolean hassent = false;
			for (CategoryFilter cf : CategoryFilter.values())
				if (grain.toLowerCase().trim().equals(cf.name)) {
					sendParsedPage(split[2], cf, channel);
					hassent = true;
					break;
				}
			if (!hassent) {
				StringBuffer sb = new StringBuffer("@" + event.getAuthor().getAsTag() + " \"" + split[3]
						+ "\" isn't a valid filter level. You may try:\n```");
				boolean firstappend = true;
				for (CategoryFilter cf : CategoryFilter.values()) {
					if (firstappend)
						firstappend = false;
					else
						sb.append(" | ");
					sb.append(cf.name);
				}
				sb.append("```");
				channel.sendMessage(sb.toString()).queue();
			}
		} else {
			channel.sendMessage("@" + event.getAuthor().getAsTag()
					+ " Make sure you include a valid poe.trade search ID.\nTry this:\n```h! list <poe.trade search id>```")
					.queue();
		}
	}

	private static void sendParsedPage(String poetradeID, CategoryFilter maxFilter, MessageChannel channel) {
		try {
			ParsedPage page = new ParsedPage(poetradeID);
			ArrayList<String> al = page.toStringArray(maxFilter);
			sendMessageList(channel, al);
		} catch (Exception e) {
			channel.sendMessage("@Darkxell#1655\nYour bot's boken, dude. Error details:\n" + e.getClass() + "\n"
					+ e.getLocalizedMessage()).queue();
		}
	}

	private synchronized static void sendMessageList(MessageChannel channel, ArrayList<String> messages) {
		for (String string : messages)
			channel.sendMessage(string).queue();
	}

}
