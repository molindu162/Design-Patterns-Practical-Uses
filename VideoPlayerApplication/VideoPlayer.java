public class VideoPlayer {
    private State state;

    public VideoPlayer(State state) {
        this.state = state;
    }

    public void changeState(State newState){
        System.out.println("State changed");
        state = newState;
    }

    public void render(){
        state.execute();
    }
}
