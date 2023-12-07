package lab10.abstractfactorypattern.pseudocode;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
        button = new MacButton();
    }
    public void createUI(){
        this.button= factory.createButton();
    }
    public void paint(){
        button.paint();
    }

}
