package MediaPlayer;

public class PlayerController {
    private MediaPlayer player;


    public PlayerController(MediaPlayer player){
        this.player = player;
    }

    void startPlayback() {
        player.displayStatus();
        player.play();
    }

    void pausePlayback() {
        player.pause();
    }

    void stopPlayback() {
        player.stop();
    }
}
