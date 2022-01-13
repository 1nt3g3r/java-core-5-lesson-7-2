package digit.splitter;

import digit.Digit;

public class DigitSplitter {
    public Digit[] split(int number) {
        String[] stringDigits = Integer.toString(number).split("");

        Digit[] result = new Digit[stringDigits.length];

        for (int i = 0; i < stringDigits.length; i++) {
            result[i] = Digit.valueOf(Integer.parseInt(stringDigits[i]));
        }

        return result;
    }
}
