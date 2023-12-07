package lab10.builderpattern.pseudocode;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car sportsCar = carBuilder.getResult();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual sportsCarManual = manualBuilder.getResult();

        System.out.println("Sports Car:");
        System.out.println(sportsCar);

        System.out.println("\nSports Car Manual:");
        System.out.println(sportsCarManual);
    }
}
