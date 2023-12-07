package lab10.commandpattern.pseudocode;

public class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(editor);
    }

    @Override
    boolean execute() {
        app.undo();
        return false;
    }
}
