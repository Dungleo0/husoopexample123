package lab10.abstractfactorypattern.pseudocode;

public class TestMain {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();

        Application app = configureApplication();
        app.createUI();
        app.paint();

        Application app1 = new Application(factory);
        app1.createUI();
        app1.paint();

        Application app2 = new Application(new WinFactory());
        app2.createUI();
        app2.paint();


    }

}
