package digit;

import digit.input.FileNumberReader;
import digit.input.KeyboardNumberReader;
import digit.input.NumberReader;
import digit.input.StringNumberReader;
import digit.output.DigitPrinter;
import digit.output.SevenSegmentDigitPrinter;
import digit.output.SimpleDigitPrinter;
import digit.splitter.DigitSplitter;

public class DigitRunner {
    public static void main(String[] args) {
        NumberReader numberReader = new FileNumberReader("input.txt");
                //new StringNumberReader("167");
        //new KeyboardNumberReader();
        DigitSplitter digitSplitter = new DigitSplitter();
        DigitPrinter digitPrinter = new SimpleDigitPrinter();
                //new SevenSegmentDigitPrinter();

        int number = numberReader.readNumber();
        Digit[] digits = digitSplitter.split(number);
        digitPrinter.print(digits);
    }
}
