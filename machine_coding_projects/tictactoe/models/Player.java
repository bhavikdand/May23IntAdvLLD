package machine_coding_projects.tictactoe.models;

import javafx.util.Pair;

import java.util.Scanner;

public class Player {

    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Pair<Integer, Integer> getNextMove(Board board){
        System.out.println(name +"'s turn, please enter row and column");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new Pair<>(row, col);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
