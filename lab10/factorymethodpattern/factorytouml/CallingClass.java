package lab10.factorymethodpattern.factorytouml;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        Fruit fruit = factory.provideFruit("apple");
        fruit.produceJuice();

        fruit = factory.provideFruit("orange");
        fruit.produceJuice();

        fruit = factory.provideFruit("banana");
        fruit.produceJuice();
    }
}
