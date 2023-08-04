package machine_coding_projects.tictactoe.models;

import javafx.util.Pair;

import java.util.Scanner;

public abstract class Player {

    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public abstract Pair<Integer, Integer> getNextMove(Board board);

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
