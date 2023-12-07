package lab10.builderpattern.pseudocode;

public interface Builder {
    Builder reset();
    Builder setSeats(String seats);
    Builder setEngine(String engine);
    Builder setTripComputer(boolean tripComputer);
    Builder setGPS(boolean gps);

}
