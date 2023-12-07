package lab10.builderpattern.pseudocode;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(String seats) {
        car.setSeats(seats);
        return this;
    }


    @Override
    public Builder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean tripComputer) {
        car.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean gps) {
        car.setGps(gps);
        return this;
    }


    public Car getResult() {
        Car result = car;
        reset();
        return result;
    }
}
