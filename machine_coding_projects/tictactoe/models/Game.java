package machine_coding_projects.tictactoe.models;

import machine_coding_projects.tictactoe.exceptions.InvalidGameConstructionException;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;

    private int currentPlayerIndex;
    private GameStatus gameStatus;
    private List<Move> moves;

    private Game(GameBuilder gameBuilder) {
        this.players = gameBuilder.players;
        this.gameStatus = gameBuilder.gameStatus;
        this.board = gameBuilder.board;
        this.moves = gameBuilder.moves;
        this.currentPlayerIndex = gameBuilder.currentPlayerIndex;
    }


    public void makeMove(){
        /*
        1. Get the cell on which the player wants to move,
        2. Validate the cell
        3. If the cell looks good, then make the move
        4. Check for win or draw
        5. If there is a win or a draw, update the game status accordingly
        6. Else increment currentPlayerIndex
         */
        Player currentPlayer = players.get(currentPlayerIndex);
        Cell nextCell = currentPlayer.getNextCell();

        if(validateCell(nextCell)){
            //make the move
            if(checkForWin()){
                gameStatus = GameStatus.ENDED;
            }
            if(checkForDraw()){
                gameStatus = GameStatus.DRAW;
            }
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }


    }



    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public static class GameBuilder{
        private Board board;
        private List<Player> players;

        private int currentPlayerIndex;
        private GameStatus gameStatus;
        private List<Move> moves;

        public Game build() throws InvalidGameConstructionException{
            if(players == null || players.size() == 0){
                throw new InvalidGameConstructionException("Players cannot be null or empty");
            }
            this.board = new Board(players.size()+1);
            this.currentPlayerIndex = 0;
            this.gameStatus = GameStatus.IN_PROGRESS;
            this.moves = new ArrayList<>();
            return new Game(this);
        }


        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setCurrentPlayerIndex(int currentPlayerIndex) {
            this.currentPlayerIndex = currentPlayerIndex;
            return this;
        }

        public GameBuilder setGameStatus(GameStatus gameStatus) {
            this.gameStatus = gameStatus;
            return this;
        }

        public GameBuilder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }
    }
}
