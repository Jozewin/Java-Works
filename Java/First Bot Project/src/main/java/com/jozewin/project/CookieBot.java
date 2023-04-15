package com.jozewin.project;


import com.jozewin.project.listener.actionListener;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;
/**
This is the place where we write code for our bot
@author - Jozewin
**/
public class CookieBot {

    private final Dotenv config;
    private final ShardManager shardManager;

    public CookieBot() throws LoginException {

        config = Dotenv.configure().load();
        String token = config.get("TOKEN");

        /**
        *Creating a ShardManager and load it using environmental varialble
        *@LoginException when the TOKEN is invalid.
        **/
        DefaultShardManagerBuilder builder  = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.IDLE).setActivity(Activity.watching("How to eat a Carrot >-<"));
        shardManager = builder.build();

        shardManager.addEventListener(new actionListener());
    }

    public Dotenv getConfig()
    {
        return config;
    }
    /**
    Returns the Shard for every instance the user calls
    **/
    public ShardManager getShardManager()
    {
        return shardManager;
    }

    public static void main(String[] args) {

        /**
        Main body of code
        Where the code gets executed
        **/
        try {
            CookieBot bot = new CookieBot();
        } catch (LoginException e) {
            System.out.println("Error :- Token is Invalid!! ");
        }

    }
}
