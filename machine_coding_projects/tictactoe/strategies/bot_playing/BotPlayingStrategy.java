package machine_coding_projects.tictactoe.strategies.bot_playing;

import javafx.util.Pair;
import machine_coding_projects.tictactoe.models.Board;

public interface BotPlayingStrategy {
    Pair<Integer, Integer> getNextMove(Board board);
}
