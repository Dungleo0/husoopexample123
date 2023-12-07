package lab10.factorymethodpattern.factorymethodexample;

public class Main {
    public static void main(String[] args) {

        PizzaFactory.PizzaType type = PizzaFactory.PizzaType.Seafood;
        IPizza pizza;

        if (type == PizzaFactory.PizzaType.Seafood) {
            pizza = new SeafoodPizza();
        } else if (type == PizzaFactory.PizzaType.Deluxe) {
            pizza = new DeluxePizza();
        } else {
            pizza = new HamAndMushroomPizza();
        }

        System.out.println(pizza.getPrice());


        PizzaFactory.PizzaType type2 = PizzaFactory.PizzaType.Deluxe;
        IPizza pizza2 = null;
        
        if (type2 == PizzaFactory.PizzaType.Seafood) {
            pizza2 = new SeafoodPizza();
        } else if (type2 == PizzaFactory.PizzaType.Deluxe) {
            pizza2 = new DeluxePizza();
        }else if (type2 == PizzaFactory.PizzaType.HamMushroom){
            pizza2 = new HamAndMushroomPizza();
        }
        System.out.println(pizza2.getPrice());


        PizzaFactory.PizzaType type3 = PizzaFactory.PizzaType.HamMushroom;
        IPizza pizza3 = null;

        pizza3 = new HamAndMushroomPizza();
        System.out.println(pizza3.getPrice());
    }
}
