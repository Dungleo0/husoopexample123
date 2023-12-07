package lab9.observerpattern.pseudocode;

import java.io.File;

public class LoggingListener implements EventListener{
    private File log;
    private String message;
    public LoggingListener(File log, String message) {
        this.log = log;
        this.message = message;
    }

    @Override
    public void update(String eventType, File file) {
        log.canWrite();
    }
}
