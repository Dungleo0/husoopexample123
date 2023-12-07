package lab10.builderpattern.pseudocode;

public class CarManualBuilder implements Builder{

    private Manual manual = new Manual();
    public CarManualBuilder() {
        this.reset();
    }
    @Override
    public Builder reset() {
        this.manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(String seats) {
        manual.setManualText("Document car seat features: " + seats + "\n");
        return this;
    }


    @Override
    public Builder setEngine(String engine) {
        manual.setManualText("Add engine instructions: " + engine + "\n");
        return this;
    }

    @Override
    public Builder setTripComputer(boolean tripComputer) {
        manual.setManualText("Add trip computer instructions: " + tripComputer + "\n");
        return this;
    }

    @Override
    public Builder setGPS(boolean gps) {
        manual.setManualText("Add GPS instructions: " + gps + "\n");
        return this;
    }


    public Manual getResult() {
        Manual result = manual;
        reset();
        return result;
    }
}
