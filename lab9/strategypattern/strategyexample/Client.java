package lab9.strategypattern.strategyexample;

public class Client {
    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.eat();

        Animal animal1 = new Bird();
        animal1.eat();

        AnimalStrategy exampleStrategy = new AnimalStrategy();
        exampleStrategy.setAnimal(new Bird());

        exampleStrategy.getAnimal().eat();

        exampleStrategy.setAnimal(new Dog());
        exampleStrategy.getAnimal().eat();


    }
}
