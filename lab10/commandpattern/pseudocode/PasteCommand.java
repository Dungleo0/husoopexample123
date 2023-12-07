package lab10.commandpattern.pseudocode;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    boolean execute() {
        saveBackup();
        return true;
    }
}
