package machine_coding_projects.tictactoe.strategies;

import javafx.util.Pair;
import machine_coding_projects.tictactoe.exceptions.InvalidGameStateException;
import machine_coding_projects.tictactoe.models.Board;
import machine_coding_projects.tictactoe.models.Cell;
import machine_coding_projects.tictactoe.models.CellStatus;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Pair<Integer, Integer> getNextMove(Board board) {
        for (List<Cell> row : board.getCells()) {
            for (Cell cell : row) {
                if(cell.getCellStatus().equals(CellStatus.AVAILABLE)){
                    return new Pair<>(cell.getRow(), cell.getCol());
                }
            }
        }
        throw new InvalidGameStateException("No valid move left for bot");
    }
}
