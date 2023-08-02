package machine_coding_projects.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<List<Cell>> cells;

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public Board(int n) {
        this.cells = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            this.cells.add(new ArrayList<>(n));
        }
    }
}
