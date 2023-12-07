package lab10.builderpattern.pseudocode;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats("2");
        builder.setEngine("SportEngine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

}
