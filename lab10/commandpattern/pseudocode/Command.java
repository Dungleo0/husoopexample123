package lab10.commandpattern.pseudocode;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected  String backup;

    public Command(Editor editor) {
        this.app = app;
        this.editor = editor;
    }
    public void saveBackup() {
        backup = editor.text;
    }

    abstract boolean execute();

    public void undo(){
        editor.text = backup;
    }
}
