package machine_coding_projects.tictactoe.models;

public class Bot extends Player{
    private BotLevel botLevel;


    public Bot(String name, char symbol, BotLevel botLevel) {
        super(name, symbol);
        this.botLevel = botLevel;
    }
}
