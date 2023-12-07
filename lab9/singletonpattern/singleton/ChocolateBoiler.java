package lab9.singletonpattern.singleton;

public class ChocolateBoiler {

    private static ChocolateBoiler instance;
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            instance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
