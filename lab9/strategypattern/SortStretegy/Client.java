package lab9.strategypattern.SortStretegy;

public class Client {

    public static void main(String[] args) {

        int[] array = new int[]{1, 9, 0, 2, 2, 0, 0, 4};

        Sort sortStrategy = new SelectionSort();
        sortStrategy.sort(array);
        for (int x : array) {
            System.out.print(x + "");
        }
        System.out.println();



        Sort sort = new BubbleSort();
        sort.sort(array);
        for (int x : array) {
            System.out.print(x + "");
        }
        System.out.println();

        Sort sort2 = new InsertionSort();
        sort2.sort(array);
        for (int x : array) {
            System.out.print(x + "");
        }
        System.out.println();

        SortStrategy strategy = new SortStrategy();
        strategy.setStrategy(new BubbleSort());
        strategy.sort(array);
        for (int x : array) {
            System.out.print(x + "");
        }
        System.out.println();

    }
}
