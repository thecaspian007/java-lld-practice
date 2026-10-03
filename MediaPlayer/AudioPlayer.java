package MediaPlayer;

public class AudioPlayer extends MediaPlayer {
    private String audioFile;

    public AudioPlayer(String audioFile) {
        super("AudioPlayer");
        this.audioFile = audioFile;
    }

    @Override
    void play() {
        logAction("Playing audio: " + audioFile);
    }

    @Override
    void pause() {
        logAction("Paused audio: " + audioFile);
    }

    @Override
    void stop() {
        logAction("Stopped audio: " + audioFile);
    }

}
