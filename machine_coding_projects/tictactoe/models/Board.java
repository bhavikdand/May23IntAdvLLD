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
        this.cells = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Cell> row = new ArrayList<>();
            for(int j=0; j<n; j++) {
                row.add(new Cell(i, j));
            }
            cells.add(row);
        }
    }

    public Cell getCell(int row, int col){
        return cells.get(row).get(col);
    }

    public int getSize(){
        return cells.size();
    }

    public void displayBoard(){
        for (List<Cell> row : cells) {
            for (Cell cell : row) {
                if(cell.getCellStatus().equals(CellStatus.AVAILABLE)){
                    System.out.print(" _ ");
                } else {
                    System.out.print(" " + cell.getPlayer().getSymbol() +" ");
                }
            }
            System.out.println();
        }
    }
}
