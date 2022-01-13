package digit.splitter;

import digit.Digit;

import java.util.Arrays;

public class DigitSplitterTests {
    public static void main(String[] args) {
        DigitSplitter splitter = new DigitSplitter();

        Digit[] digits = splitter.split(157);

        System.out.println(Arrays.toString(digits));
    }
}
