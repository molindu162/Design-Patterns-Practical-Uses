public class StoppedState implements State{
    private VideoPlayer player;

    public StoppedState(VideoPlayer player) {
        this.player = player;
    }
    @Override
    public void play() {
        System.out.println("Locked");
    }

    @Override
    public void pause() {
        System.out.println("Locked");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
        player.changeState(new StoppedState(player));
    }
}
