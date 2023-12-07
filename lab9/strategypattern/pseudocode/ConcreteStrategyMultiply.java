package lab9.strategypattern.pseudocode;

public class ConcreteStrategyMultiply implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a*b;
    }

}
