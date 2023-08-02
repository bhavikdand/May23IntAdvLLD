package machine_coding_projects.tictactoe.exceptions;

public class InvalidGameStateException extends RuntimeException{
    public InvalidGameStateException(String message) {
        super(message);
    }
}
