package lab9.decoratorpattern.icecream;

public class Client {
    public static void main(String[] args) {
        IceCream vanillaIceCreamWithHoneyTopping = new VanillalceCream(new NutsToppingDecorator());
        String vanillaIceCreamWithHoneyToppingDescription = vanillaIceCreamWithHoneyTopping.getDescription();
        System.out.println("You ordered: " + vanillaIceCreamWithHoneyToppingDescription);

        IceCream strawberryCreamWithNutsTopping = new StrawberryIceCream(new NutsToppingDecorator());
        String strawberryCreamWithNutsToppingDescription = strawberryCreamWithNutsTopping.getDescription();
        System.out.println("You ordered: " + strawberryCreamWithNutsToppingDescription);

        IceCream chocolateIceCreamWithHoneyAndNutsTopping = new ChocolateIceCream(new NutsToppingDecorator());
        String chocolateIceCreamWithHoneyAndNutsToppingDescription = chocolateIceCreamWithHoneyAndNutsTopping.getDescription();
        System.out.println("You ordered: " + chocolateIceCreamWithHoneyAndNutsToppingDescription);
    }
}
