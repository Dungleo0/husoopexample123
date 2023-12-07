package lab9.strategypattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static Map<Integer, Integer> princeOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        princeOnProducts.put(1, 2200);
        princeOnProducts.put(2, 1850);
        princeOnProducts.put(3, 1100);
        princeOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost = 0;
            String continueChoice = "";
            do {
                System.out.println("Please , select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");

                int choice = Integer.parseInt(reader.readLine());
                cost = princeOnProducts.get(choice);

                System.out.println("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);

                System.out.println("Do you wish to continue selecting product Y/N");
                continueChoice = reader.readLine();

            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please select a payment method: " + "\n"
                        + "1 - PalPay" + "\n"
                        + "2 - Credit Card" + "\n");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equalsIgnoreCase("1")) {
                    strategy = new PayByPaypal();
                    order.processOrderUsingPaypal((PayByPaypal) strategy);
                } else {
                    strategy = new PayByCreditCard();
                    order.processOrderUsingCreditCard((PayByCreditCard) strategy);
                }
            }

            System.out.println("Pay " + order.getTotalCost()
                    + "units or continue shopping P/C");
            String proceed = reader.readLine();

            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successfully");
                } else {
                    System.out.println("Fall , Please, check your data");
                }
                order.setClosed();
            }
        }
    }
}

