package digit.output;

import digit.Digit;

public class DigitPrinterTests {
    public static void main(String[] args) {
        DigitPrinter printer = new SevenSegmentDigitPrinter();

        Digit[] digits = {
                Digit.one,
                Digit.five,
                Digit.seven,
                Digit.seven,
                Digit.zero,
                Digit.nine
        };

        printer.print(digits);
    }
}
