package MediaPlayer;

public class MediaPlayerApp {
    public static void main(String[] args){
        PlayerController audioCtrl = new PlayerController(new AudioPlayer("song.mp3"));
        audioCtrl.startPlayback();
        audioCtrl.pausePlayback();

        System.out.println();

        PlayerController videoCtrl = new PlayerController(new VideoPlayer("movie.mp4", "1080p"));
        videoCtrl.startPlayback();
        videoCtrl.pausePlayback();

        System.out.println();

        PlayerController streamCtrl = new PlayerController(new StreamingPlayer("https://stream.example.com/live", 2048));
        streamCtrl.startPlayback();
        streamCtrl.pausePlayback();
    }
}
