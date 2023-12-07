package lab9.decoratorpattern.icecream;

public class NutsToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public NutsToppingDecorator(){

    }
    @Override
    String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    String addTopping() {
        return "With nuts topping";
    }
}
