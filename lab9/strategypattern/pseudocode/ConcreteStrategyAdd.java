package lab9.strategypattern.pseudocode;

public class ConcreteStrategyAdd implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a+b;
    }
    
}
