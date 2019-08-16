package behavioral_patterns.command;

public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
