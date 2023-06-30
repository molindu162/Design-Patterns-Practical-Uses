public class PausedState implements State{
    @Override
    public void execute() {
        System.out.println("Paused");
    }
}
