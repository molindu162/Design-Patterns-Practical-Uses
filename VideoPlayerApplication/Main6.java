public class Main6 {
    public static void main(String[] args){
        PlayingState playingState = new PlayingState();
        VideoPlayer videoPlayer = new VideoPlayer(playingState);
        videoPlayer.render();
    }
}
