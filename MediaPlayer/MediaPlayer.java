package MediaPlayer;

public abstract class MediaPlayer {
    protected String playerName;

    public MediaPlayer(String playerName) {
        this.playerName = playerName;
    }

    abstract void play();
    abstract void pause();
    abstract void stop();

    void displayStatus() {
        System.out.println("[" + playerName + "] Status: Ready");
    }

    void logAction(String action) {
        System.out.println("[" + playerName + "] Action: " + action);
    }
}
