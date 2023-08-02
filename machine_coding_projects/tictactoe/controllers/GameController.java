package machine_coding_projects.tictactoe.controllers;

import machine_coding_projects.tictactoe.exceptions.InvalidGameConstructionException;
import machine_coding_projects.tictactoe.models.Game;
import machine_coding_projects.tictactoe.models.GameStatus;
import machine_coding_projects.tictactoe.models.Player;

import java.util.List;

public class GameController {

    public Game createGame(List<Player> players) throws InvalidGameConstructionException {
        Game game = Game.getBuilder()
                .setPlayers(players)
                .build();
        return game;
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void makeMove(Game game){
        game.makeMove();
    }
}
