package lab9.strategypattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the care number: ");
            String number = READER.readLine();
            System.out.print("Enter the Card expiration date mm/yy: ");
            String date =READER.readLine();
            System.out.print("Enter the Care Verification Value code: ");
            String cardVerificationValue = READER.readLine();

            if (CreditCardValidator.isValid(number)) {
                card = new CreditCard(number, date, cardVerificationValue);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println();
            card.setAmount(card.getAmount()-paymentAmount);
            return true;
        }
        return false;
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
