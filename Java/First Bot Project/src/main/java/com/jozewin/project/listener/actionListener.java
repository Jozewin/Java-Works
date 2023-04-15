package com.jozewin.project.listener;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.MessageUpdateEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;
import org.jetbrains.annotations.NotNull;

public class actionListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        if(message.toLowerCase().contains("hi"))
        {
            event.getChannel().sendMessage("Hey There 😊").queue();
        }

        if(message.toLowerCase().contains("how are you"))
        {
            event.getChannel().sendMessage("Yeah I'm fine wbu?").queue();
        }

        if(message.toLowerCase().contains("bye "))
        {
            event.getChannel().sendMessage("Cya Later :)").queue();
        }


    }

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event) {

        User user = event.getUser();
        String emoji = event.getReaction().getEmoji().getAsReactionCode();
        String channelMention = event.getChannel().getAsMention();

        String messageReaction = user.getAsTag()+" is reacted with emoji "+ emoji +" in "+channelMention;
        event.getChannel().sendMessage(messageReaction).queue();

    }


    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        // Make sure we only respond to events that occur in a guild
        if (!event.isFromGuild()) return;
        // This makes sure we only execute our code when someone sends a message with "!play"
        if (!event.getMessage().getContentRaw().startsWith("!play")) return;
        // Now we want to exclude messages from bots since we want to avoid command loops in chat!
        // this will include own messages as well for bot accounts
        // if this is not a bot make sure to check if this message is sent by yourself!
        if (event.getAuthor().isBot()) return;
        Guild guild = event.getGuild();
        // This will get the first voice channel with the name "music"
        // matching by voiceChannel.getName().equalsIgnoreCase("music")
        VoiceChannel channel = guild.getVoiceChannelsByName("music", true).get(0);
        AudioManager manager = guild.getAudioManager();

        // MySendHandler should be your AudioSendHandler implementation
        manager.setSendingHandler(new MySendHandler());
        // Here we finally connect to the target voice channel
        // and it will automatically start pulling the audio from the MySendHandler instance
        manager.openAudioConnection(channel);
    }

}



