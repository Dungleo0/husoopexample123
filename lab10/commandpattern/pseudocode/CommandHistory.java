package lab10.commandpattern.pseudocode;

import java.util.ArrayList;

public class CommandHistory {
    private ArrayList<Command> history = new ArrayList<>();

    public void push(Command c) {
        history.add(c);
    }
    public Command pop() {
        if (!history.isEmpty()) {
            int lastIndex = history.size() - 1;
            Command command = history.get(lastIndex);
            history.remove(lastIndex);
            return command;
        }
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
