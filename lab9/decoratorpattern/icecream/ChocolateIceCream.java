package lab9.decoratorpattern.icecream;

public class ChocolateIceCream extends IceCream{
    public ChocolateIceCream(NutsToppingDecorator nutsToppingDecorator){

    }
    @Override
    String getDescription() {
        return "Chocolate ice cream";
    }
}
