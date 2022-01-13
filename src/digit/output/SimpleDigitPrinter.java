package digit.output;

import digit.Digit;

public class SimpleDigitPrinter implements DigitPrinter {
    @Override
    public void print(Digit[] digits) {
        for (Digit digit : digits) {
            System.out.print(digit.getValue());
        }
        System.out.println();
    }
}
