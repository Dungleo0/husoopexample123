package lab10.abstractfactorypattern.demoabstractfactory;

public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }

    public void getProduct(){
        System.out.println("Concreate Factory 2");
    }
}
