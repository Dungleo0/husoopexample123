package lab10.commandpattern.pseudocode;

public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);

    }

    @Override
    boolean execute() {
        return false;
    }
}
