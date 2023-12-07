package lab10.commandpattern.commandtouml;

public class ShutDownCommand implements Command{
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.shutDown();
    }
}
