package machine_coding_projects.tictactoe.strategies.check_win;

import machine_coding_projects.tictactoe.models.Move;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneWinningStrategy implements PlayerWonStrategy{

    private List<Map<Character, Integer>> rows;
    private List<Map<Character, Integer>> cols;
    private Map<Character, Integer> diagonal;
    private Map<Character, Integer> reverseDiagonal;

    public OrderOneWinningStrategy(int n) {
        rows = new ArrayList<>();
        cols = new ArrayList<>();
        for(int i=0; i<n; i++){
            rows.add(new HashMap<>());
            cols.add(new HashMap<>());
        }
        diagonal = new HashMap<>();
        reverseDiagonal = new HashMap<>();
    }

    @Override
    public boolean hasWon(Move move) {

        char symbol = move.getPlayer().getSymbol();
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        //Update the maps
        Map<Character, Integer> map = rows.get(row);
        map.put(symbol, map.getOrDefault(symbol, 0) + 1);

        map = cols.get(col);
        map.put(symbol, map.getOrDefault(symbol, 0) + 1);

        boolean cellExistsOnDiagonal = row == col;
        int n = rows.size();
        boolean cellExistsOnReverseDiagonal = (row + col == n - 1);

        if(cellExistsOnDiagonal){
            diagonal.put(symbol, map.getOrDefault(symbol, 0) + 1);
        }
        if(cellExistsOnReverseDiagonal){
            reverseDiagonal.put(symbol, map.getOrDefault(symbol, 0) + 1);
        }

        // Updation of the maps end
        // Check is player has won
        boolean wonOnRow = rows.get(row).get(symbol) == n;
        boolean wonOnCol = cols.get(col).get(symbol) == n;
        boolean wonOnDiagonal = cellExistsOnDiagonal && diagonal.get(symbol) == n;
        boolean wonOnReverseDiagonal = cellExistsOnReverseDiagonal && reverseDiagonal.get(symbol) == n;

        return wonOnRow || wonOnCol || wonOnDiagonal || wonOnReverseDiagonal;
    }
}
