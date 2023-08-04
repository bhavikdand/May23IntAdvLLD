package machine_coding_projects.tictactoe;

import machine_coding_projects.tictactoe.controllers.GameController;
import machine_coding_projects.tictactoe.exceptions.InvalidGameConstructionException;
import machine_coding_projects.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number human of players:");
        int num = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0; i<num; i++){
            System.out.println("Enter name of the player #" + (i+1));
            String name = scanner.next();
            System.out.println("Enter symbol for the player #" + (i+1));
            char symbol = scanner.next().charAt(0);
            Player player = new HumanPlayer(name, symbol);
            players.add(player);
        }

        System.out.println("Should we add a bot? Y/N");
        String addBot = scanner.next();
        if(addBot.equalsIgnoreCase("y")){
            //TODO get bot type as input from users
            players.add(new Bot("BOT-1", 'B', BotLevel.LOW));
        }


        GameController gameController = new GameController();
        Game game;
        try {
            game = gameController.createGame(players);
        } catch (InvalidGameConstructionException e) {
            System.out.println("Invalid game construction exception:" + e.getMessage());
            return;
        }

        boolean isFirstMove = true;

        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            gameController.displayBoard(game);
            if(!isFirstMove){
                gameController.undo(game);
            } else {
                isFirstMove = false;
            }
            gameController.makeMove(game);
        }

        if(gameController.getGameStatus(game).equals(GameStatus.ENDED)){
            Player player = gameController.getCurrentPlayer(game);
            System.out.println(player.getName() + " has won!");
        }

        if(gameController.getGameStatus(game).equals(GameStatus.DRAW)){
            System.out.println("Game has drawn!");
        }

        System.out.println("Final board");
        gameController.displayBoard(game);

    }
}
