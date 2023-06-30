public class PausedState implements State{
    private VideoPlayer player;

    public PausedState(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Locked");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
        player.changeState(new PausedState(player));
    }

    @Override
    public void stop() {
        System.out.println("Locked");
    }
}
