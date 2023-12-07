package lab9.strategypattern.strategyexample;

public class Bird implements Animal {

    public Bird() {
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleep");
    }

    @Override
    public void speak() {
        System.out.println("Chip chip");
    }

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }
}
