package machine_coding_projects.tictactoe.models;

import javafx.util.Pair;
import machine_coding_projects.tictactoe.exceptions.InvalidGameConstructionException;
import machine_coding_projects.tictactoe.strategies.check_win.OrderOneWinningStrategy;
import machine_coding_projects.tictactoe.strategies.check_win.PlayerWonStrategy;
import machine_coding_projects.tictactoe.utils.MoveUtils;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;

    private int currentPlayerIndex;
    private GameStatus gameStatus;
    private List<Move> moves;

    private PlayerWonStrategy playerWonStrategy;

    private Game(GameBuilder gameBuilder) {
        this.players = gameBuilder.players;
        this.gameStatus = gameBuilder.gameStatus;
        this.board = gameBuilder.board;
        this.moves = gameBuilder.moves;
        this.currentPlayerIndex = gameBuilder.currentPlayerIndex;
        this.playerWonStrategy = gameBuilder.playerWonStrategy;
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
        Pair<Integer, Integer> nextMove = currentPlayer.getNextMove(board);

        while(!MoveUtils.validateMove(nextMove, board)) {
            System.out.println("Not a valid move, please choose another cell");
            nextMove = currentPlayer.getNextMove(board);
        }
        //make the move
        // 1. Set cell status to Occupied
        Cell cell = board.getCell(nextMove.getKey(), nextMove.getValue());
        cell.setPlayer(currentPlayer);
        // 2. Create a move obj and add it to the list of moves
        Move move = new Move(cell, currentPlayer);
        moves.add(move);
        if(checkForWin(move)){
            gameStatus = GameStatus.ENDED;
            return;
        }
        if(checkForDraw()){
            gameStatus = GameStatus.DRAW;
            return;
        }
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();

    }

    private boolean checkForWin(Move move){
        return playerWonStrategy.hasWon(move);
    }

    public Player getCurrentPlayer(){
        return players.get(currentPlayerIndex);
    }

    private boolean checkForDraw(){
        return moves.size() == board.getSize() * board.getSize();
    }



    public void displayBoard(){
        board.displayBoard();
    }

    public void undo(){
        int lastPlayerIndex = (currentPlayerIndex + players.size() -1 ) % players.size();
        Player lastPlayer = players.get(lastPlayerIndex);
        if((lastPlayer instanceof HumanPlayer)){
            // This is a human player, you can ask for undo
            HumanPlayer hp = (HumanPlayer) lastPlayer;
            if(hp.undo()){
                Move lastMove = moves.remove(moves.size() - 1);
                Cell cell = lastMove.getCell();
                cell.removePlayer();
                this.playerWonStrategy.handleUndo(lastMove);
                currentPlayerIndex = lastPlayerIndex;
                System.out.println("Board after undo:");
                displayBoard();

            } else {

            }

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
        private PlayerWonStrategy playerWonStrategy;

        public Game build() throws InvalidGameConstructionException{
            if(players == null || players.size() == 0){
                throw new InvalidGameConstructionException("Players cannot be null or empty");
            }
            this.board = new Board(players.size()+1);
            this.currentPlayerIndex = 0;
            this.gameStatus = GameStatus.IN_PROGRESS;
            this.moves = new ArrayList<>();
            this.playerWonStrategy = new OrderOneWinningStrategy(board.getSize());
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
