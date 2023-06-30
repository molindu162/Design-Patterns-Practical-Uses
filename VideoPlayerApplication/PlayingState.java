public class PlayingState implements State{
    private VideoPlayer player;

    public PlayingState(VideoPlayer player) {
        this.player = player;
    }
    @Override
    public void play() {
        System.out.println("Playing");
        player.changeState(new PlayingState(player));
    }

    @Override
    public void pause() {
        System.out.println("Locked");
    }

    @Override
    public void stop() {
        System.out.println("Locked");
    }
}
