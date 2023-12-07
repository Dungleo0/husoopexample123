package lab10.commandpattern.pseudocode;

import java.util.ArrayList;

public class Application {
    String clipboard;
    ArrayList<Editor> editors;
    Editor activeEditor;
    CommandHistory history;

    public void createUI() {
        System.out.println("createUI started ");
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
