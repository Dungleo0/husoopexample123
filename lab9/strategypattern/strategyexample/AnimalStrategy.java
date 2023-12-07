package lab9.strategypattern.strategyexample;

public class AnimalStrategy {
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "AnimalStrategy{" +
                "animal=" + animal +
                '}';
    }
}
