package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> history;

    public RemoteControl() {
        this.history = new ArrayList<>();
    }

    public void buttonPressed(Command command) {
        history.add(command);
        command.execute();
    }
}
