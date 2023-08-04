package machine_coding_projects.tictactoe.strategies.check_win;

import machine_coding_projects.tictactoe.models.Move;

public interface PlayerWonStrategy {

    boolean hasWon(Move move);
}
