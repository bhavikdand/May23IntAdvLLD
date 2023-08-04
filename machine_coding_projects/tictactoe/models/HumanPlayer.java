package machine_coding_projects.tictactoe.models;

import javafx.util.Pair;
import machine_coding_projects.tictactoe.utils.MoveUtils;

import java.util.Scanner;

public class HumanPlayer extends Player implements UndoMove{
    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    public Pair<Integer, Integer> getNextMove(Board board){
        System.out.println(getName() +"'s turn, please enter row and column");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new Pair<>(row, col);
    }


    @Override
    public boolean undo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to do? Y/N");
        char input = scanner.next().charAt(0);
        return input == 'y' || input == 'Y';
    }
}
