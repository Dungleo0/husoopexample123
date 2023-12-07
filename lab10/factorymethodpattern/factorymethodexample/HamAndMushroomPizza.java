package lab10.factorymethodpattern.factorymethodexample;

public class HamAndMushroomPizza implements IPizza{
    private double price = 8.5;

    @Override
    public double getPrice() {
        return price;
    }
}
