package lab9.observerpattern.pseudocode;

import java.io.File;

public class Editor {
    private File file;
    public EventManager events;

    public Editor() {
        this.file = file;
        this.events = new EventManager();
    }
    public void open(File file) {
        this.file = file;
        this.events.notify("open", file);
    }
    public void save(File file) {
        this.file = file;
        this.events.notify("save", file);
    }

}
