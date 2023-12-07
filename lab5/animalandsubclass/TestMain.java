package lab5.animalandsubclass;

public class TestMain {

    public static void main(String[] args) {
        Animal animal = new Animal("Pikachuuu");
        System.out.println(animal);

        Mammal mammal = new Mammal("Doraemon");
        System.out.println(mammal);

        Cat cat = new Cat("Cat");
        System.out.println(cat);
        cat.greets();


        Dog dog = new Dog("Dog");
        System.out.println(dog);
        dog.greets();
        dog.greets(new Dog("DogRed"));

    }
}
