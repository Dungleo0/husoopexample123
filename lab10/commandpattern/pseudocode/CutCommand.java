package lab10.commandpattern.pseudocode;

public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }
    @Override
    boolean execute() {
        saveBackup();
        editor.deleteSelection();
        return true;
    }
}
