package MediaPlayer;

public class StreamingPlayer extends MediaPlayer{
    private String streamUrl;
    private int bufferSize;
    
    public StreamingPlayer(String streamUrl, int bufferSize) {
        super("StreamingPlayer");
        this.streamUrl = streamUrl;
        this.bufferSize = bufferSize;
    }

    @Override
    void play() {
        logAction("Streaming from: " + streamUrl + " (buffer: " + bufferSize + "KB)");
    }

    @Override
    void pause() {
        logAction("Paused stream: " + streamUrl);
    }

    @Override
    void stop() {
        logAction("Stopped stream: " + streamUrl);
    }

}
