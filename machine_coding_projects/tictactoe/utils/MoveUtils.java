package machine_coding_projects.tictactoe.utils;

import javafx.util.Pair;
import machine_coding_projects.tictactoe.models.Board;
import machine_coding_projects.tictactoe.models.Cell;
import machine_coding_projects.tictactoe.models.CellStatus;

public class MoveUtils {

    public static boolean validateMove(Pair<Integer, Integer> nextMove, Board board){
        int row = nextMove.getKey();
        int col = nextMove.getValue();
        boolean isValidCell = row >= 0 && col >= 0 && row < board.getSize() && col < board.getSize();
        if(!isValidCell){
            return false;
        }
        Cell cell = board.getCell(row, col);
        return cell.getCellStatus().equals(CellStatus.AVAILABLE);
    }
}
