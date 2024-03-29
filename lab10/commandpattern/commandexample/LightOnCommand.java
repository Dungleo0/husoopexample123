package lab10.commandpattern.commandexample;

public class LightOnCommand implements Command {
    private Light myLight;

    public LightOnCommand(Light L) {
        myLight = L;
    }

    public void execute() {
        myLight.turnOn();
    }
}
