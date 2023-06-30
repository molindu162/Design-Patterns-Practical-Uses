public class VideoPlayer {
    private State state;

    public VideoPlayer() {
        state = new StoppedState(this);
    }

    public void changeState(State newState){
        state = newState;
    }

    public void play(){
        changeState(new PlayingState(this));
        state.play();
    }

    public void pause(){
        changeState(new PausedState(this));
        state.pause();
    }

    public void stop(){
        changeState(new StoppedState(this));
        state.stop();
    }

}
