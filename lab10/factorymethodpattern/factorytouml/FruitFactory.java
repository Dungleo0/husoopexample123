package lab10.factorymethodpattern.factorytouml;

public class FruitFactory {
    private Fruit fruit;

    public Fruit provideFruit(String type) {
        if (type.equalsIgnoreCase("apple")) {
            fruit = new Apple();
        } else if (type.equals("orange")) {
            fruit = new Orange();
        } else if (type.equals("banana")) {
            fruit = new Banana();
        }
        return fruit;
    }

}
