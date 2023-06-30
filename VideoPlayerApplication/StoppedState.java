public class StoppedState implements State{
    @Override
    public void execute() {
        System.out.println("Stopped");
    }
}
