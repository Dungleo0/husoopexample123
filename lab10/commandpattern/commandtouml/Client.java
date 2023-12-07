package lab10.commandpattern.commandtouml;

public class Client {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Command restart = new RestartCommand(computer);

        Command shutdown = new ShutDownCommand(computer);
        Switch aSwitch = new Switch();

        String tmp = "shutdown";

        if (tmp.equals("shutdown")) {
            aSwitch.storeAndExecute(shutdown);
        } else {
            aSwitch.storeAndExecute(restart);
        }
    }
}
