package MediaPlayer;

public class VideoPlayer extends MediaPlayer {
    private String videoFile;
    private String resolution;

    public VideoPlayer(String videoFile, String resolution) {
        super("VideoPlayer");
        this.videoFile = videoFile;
        this.resolution = resolution;
    }

    @Override
    void play() {
        logAction("Playing video: " + videoFile + " at " + resolution);
    }

    @Override
    void pause() {
        logAction("Paused video: " + videoFile);
    }

    @Override
    void stop() {
        logAction("Stopped video: " + videoFile);
    }
}
