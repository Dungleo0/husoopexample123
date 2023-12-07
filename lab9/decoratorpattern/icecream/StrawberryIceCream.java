package lab9.decoratorpattern.icecream;

public class StrawberryIceCream extends IceCream{
    public StrawberryIceCream(NutsToppingDecorator nutsToppingDecorator){

    }
    @Override
    String getDescription() {
        return "Strawberry ice cream";
    }

}
