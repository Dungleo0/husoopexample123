package lab9.decoratorpattern.icecream;

public class HoneyToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    @Override
    String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    String addTopping() {
        return "With honey topping";
    }
}
