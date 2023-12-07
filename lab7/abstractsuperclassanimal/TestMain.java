package lab7.abstractsuperclassanimal;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("CatYellow");
        cat.greets();

        Dog dog = new Dog("DogRed");
        Dog dog1 = new Dog("DogBlue");
        dog.greets();
        dog.greets(dog1);

        BigDog dog2 = new BigDog("BigDog");
        BigDog dog3 = new BigDog("BigDog2");
        dog2.greets();
        dog2.greets(dog3);
    }
}
