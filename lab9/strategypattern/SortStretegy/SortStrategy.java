package lab9.strategypattern.SortStretegy;

public class SortStrategy {
    private Sort strategy;

    public void setStrategy(Sort strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] data) {
        strategy.sort(data);
    }


}
