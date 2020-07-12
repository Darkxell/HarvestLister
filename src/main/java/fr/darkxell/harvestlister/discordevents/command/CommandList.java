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
			boolean success = sendParsedPage(split[2], CategoryFilter.CATEGORY_DEFAULT, channel,
					event.getAuthor().getAsTag());
			if (success)
				deleteAndWarn(event);
		} else if (split.length == 4) {
			String grain = split[3];
			boolean hassent = false;
			for (CategoryFilter cf : CategoryFilter.values())
				if (grain.toLowerCase().trim().equals(cf.name)) {
					boolean success = sendParsedPage(split[2], cf, channel, event.getAuthor().getAsTag());
					if (success)
						deleteAndWarn(event);
					hassent = true;
					break;
				}
			if (!hassent) {
				StringBuffer sb = new StringBuffer("<@" + event.getAuthor().getAsTag() + "> \"" + split[3]
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
			channel.sendMessage("<@" + event.getAuthor().getAsTag()
					+ "> Make sure you include a valid poe.trade search ID.\nTry this:\n```h! list <poe.trade search id>```")
					.queue();
		}
	}

	private static boolean sendParsedPage(String poetradeID, CategoryFilter maxFilter, MessageChannel channel,
			String discordTag) {
		try {
			ParsedPage page = new ParsedPage(poetradeID, discordTag);
			ArrayList<String> al = page.toStringArray(maxFilter);
			sendMessageList(channel, al);
			return al.size() >= 2;
		} catch (Exception e) {
			channel.sendMessage("<@Darkxell#1655>\nYour bot's boken, dude. Error details:\n" + e.getClass() + "\n"
					+ e.getLocalizedMessage()).queue();
			return false;
		}
	}

	private synchronized static void sendMessageList(MessageChannel channel, ArrayList<String> messages) {
		for (String string : messages)
			channel.sendMessage(string).queue();
	}

	private static long lastWarningMili = 0;

	private static void deleteAndWarn(MessageReceivedEvent event) {
		try {
			event.getMessage().delete().queue();
		} catch (Exception e) {
			if (System.currentTimeMillis() >= lastWarningMili + 1000 * 60 * 30 /* 30 minutes warning cooldown */) {
				lastWarningMili = System.currentTimeMillis();
				event.getChannel().sendMessage("Warning: Couldn't delete " + event.getAuthor().getAsTag()
						+ "'s message...\nPlease give me perms.").queue();
			}
		}
	}

}
