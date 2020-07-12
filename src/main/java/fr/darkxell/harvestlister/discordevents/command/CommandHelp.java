package fr.darkxell.harvestlister.discordevents.command;

import fr.darkxell.harvestlister.discordevents.DiscordBotCommand;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CommandHelp extends DiscordBotCommand {

	@Override
	public void process(MessageReceivedEvent event) {
		MessageChannel channel = event.getChannel();
		channel.sendMessage("Hey @" + event.getAuthor().getAsTag()
				+ ", I'm sending you that in your private messages!\nIf you got nothing, check if your DMs are open.")
				.queue();
		String message1 = "Hi @" + event.getAuthor().getAsTag() + ",\r\n" + "\r\n"
				+ "This bot can list all the trades you have in a public stash tab, without the need of keeping a spreadsheet or a notepad updated.\r\n"
				+ "\r\n" + "```USAGE```\r\n" + "\r\n" + "> h! list <poe.trade search id>\r\n"
				+ "As simple as that. I will delete your post and respond with your crafting list instead.\r\n"
				+ "This command will list the 100 first stations found on the corresponding poe.trade page.\r\n"
				+ "\r\n" + "```How to get my poe.trade search ID?```\r\n" + "\r\n" + "1- Open https://poe.trade\r\n"
				+ "2- Fill the following fields. Note that the \"Seller field\" needs to be your __account name__, not IGN. It is case sensitive.\r\n"
				+ "https://cdn.discordapp.com/attachments/665520247616307233/731796073940779048/unknown.png\r\n"
				+ "https://cdn.discordapp.com/attachments/665520247616307233/731796214756147250/unknown.png";
		String message2 = "3- Your poe.trade search id is the generated text in the url here:\r\n"
				+ "https://cdn.discordapp.com/attachments/665520247616307233/731802593256407040/unknown.png";
		String message3 = "```How do I list more than 100 stations?```\r\n" + "\r\n"
				+ "Simply use a different buyout per 100 stations.\r\n"
				+ "Reminder that you can set a buyout for a whole premium tab by right clicking it.\r\n"
				+ "You can then set a min and max buyout in your poe.trade search to get different poe.trade search IDs per stash tab you have.\r\n"
				+ "\r\n" + "```How do I report a bug?```\r\n" + "\r\n"
				+ "DM Darkxell#1655 from the poe trading services discord.\r\n"
				+ "Check #server-suggestions to make sure you're not the 42th person messaging me about it, please! ^^'";
		event.getAuthor().openPrivateChannel().queue((privchannel) -> {
			privchannel.sendMessage(message1).queue();
			privchannel.sendMessage(message2).queue();
			privchannel.sendMessage(message3).queue();
		});

	}

}
