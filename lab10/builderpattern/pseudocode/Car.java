package lab10.builderpattern.pseudocode;

public class Car {
    private String seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
    @Override
    public String toString() {
        return "Car{" +
                "seats='" + seats + '\'' +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
