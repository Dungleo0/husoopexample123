package lab10.builderpattern.builderexample;

public class Main {
    public static void main(String[] args) {

        Product product = new Builder()
                .buildPartA("Part A")
                .buildPartB("Part B")
                .getResult();

        product.show();
    }
}
