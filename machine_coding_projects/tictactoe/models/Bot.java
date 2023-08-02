package machine_coding_projects.tictactoe.models;

import javafx.util.Pair;
import machine_coding_projects.tictactoe.factories.BotPlayingStrategyFactory;
import machine_coding_projects.tictactoe.strategies.BotPlayingStrategy;

public class Bot extends Player{
    private BotLevel botLevel;
    private BotPlayingStrategy botPlayingStrategy;


    public Bot(String name, char symbol, BotLevel botLevel) {
        super(name, symbol);
        this.botLevel = botLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getStrategy(this.botLevel);
    }

    @Override
    public Pair<Integer, Integer> getNextMove(Board board) {
        System.out.println("Bot is making a move");
        return botPlayingStrategy.getNextMove(board);
    }
}
