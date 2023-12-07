package lab10.factorymethodpattern.factorymethodexample;

public class PizzaFactory {
    public enum PizzaType {
        HamMushroom, Deluxe, Seafood
    }

    public IPizza createPizza(PizzaType pizzaType) {
        IPizza pizza = null;
        switch (pizzaType) {
            case HamMushroom:
                pizza = new HamAndMushroomPizza();
                break;
            case Deluxe:
                pizza = new DeluxePizza();
                break;
            case Seafood:
                pizza = new SeafoodPizza();
                break;
        }
        return pizza;
    }
}
