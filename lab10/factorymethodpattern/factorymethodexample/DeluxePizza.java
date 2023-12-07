package lab10.factorymethodpattern.factorymethodexample;

public class DeluxePizza implements IPizza{
    private double price = 10.5;

    @Override
    public double getPrice() {
        return price;
    }
}
