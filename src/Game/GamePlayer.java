package Game;

public class GamePlayer {
    private char playerSign;
    private boolean realPlayer = true;

    public GamePlayer(boolean isRealPlaer, char playerSign){
        this.realPlayer = isRealPlaer;
        this.playerSign = playerSign;
    }
    public boolean isRealPlayer(){
        return realPlayer;
    }
    public char getPlayerSign(){
        return playerSign;
    }
}
