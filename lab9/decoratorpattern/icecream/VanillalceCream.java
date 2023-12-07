package lab9.decoratorpattern.icecream;

public class VanillalceCream extends IceCream{

    public VanillalceCream(NutsToppingDecorator  nutsToppingDecorator){

    }
    @Override
    String getDescription() {
        return "Vanilla ice cream";
    }
}
