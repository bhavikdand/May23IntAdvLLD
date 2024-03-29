package machine_coding_projects.tictactoe.factories;

import machine_coding_projects.tictactoe.models.BotLevel;
import machine_coding_projects.tictactoe.strategies.bot_playing.BotPlayingStrategy;
import machine_coding_projects.tictactoe.strategies.bot_playing.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategy(BotLevel botLevel){
        switch (botLevel){
            case LOW:
            case HIGH:
            case MEDIUM:
                return new EasyBotPlayingStrategy();
        }
        throw new UnsupportedOperationException("Bot type" + botLevel + " is not supported");
    }
}
