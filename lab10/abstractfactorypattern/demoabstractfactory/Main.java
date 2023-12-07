package lab10.abstractfactorypattern.demoabstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();

        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        ((ConcreteFactory1) factory).getProduct();
        ((ConcreteFactory1) factory).getProduct();


        factory = new ConcreteFactory2();

        productA = factory.createProductA();
        productB = factory.createProductB();

        ((ConcreteFactory2) factory).getProduct();
        ((ConcreteFactory2) factory).getProduct();
    }
}

