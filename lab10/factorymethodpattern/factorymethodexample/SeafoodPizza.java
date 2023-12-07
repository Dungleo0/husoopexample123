package lab10.factorymethodpattern.factorymethodexample;

public class SeafoodPizza implements IPizza{
    private double price = 11.5;

    @Override
    public double getPrice() {
        return price;
    }
}
