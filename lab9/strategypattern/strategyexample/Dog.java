package lab9.strategypattern.strategyexample;

public class Dog implements Animal{
    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void speak() {
        System.out.println("Gau Gau");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}
