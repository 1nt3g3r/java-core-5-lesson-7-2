package digit.output;

import digit.Digit;

import java.util.Arrays;
import java.util.StringJoiner;

public class SevenSegmentDigitPrinter implements DigitPrinter {
    private static final String[][] PATTERNS = {
            //ZERO - 0
            {
                    " _ ",
                    "| |",
                    "| |",
                    " - "
            },

            //ONE - 1
            {
                    "   ",
                    "  |",
                    "  |",
                    "   "
            },

            //TWO - 2
            {
                    " _ ",
                    " _|",
                    "|  ",
                    " - "
            },

            //THREE - 3
            {
                    " _ ",
                    " _|",
                    "  |",
                    " - "
            },

            //FOUR - 4
            {
                    "   ",
                    "|_|",
                    "  |",
                    "   "
            },

            //FIVE - 5
            {
                    " _ ",
                    "|_ ",
                    "  |",
                    " - "
            },

            //FIVE - 6
            {
                    " _ ",
                    "|_ ",
                    "| |",
                    " - "
            },

            //SEVEN - 7
            {
                    " _ ",
                    "  |",
                    "  |",
                    "   "
            },

            //EIGHT - 8
            {
                    " _ ",
                    "|_|",
                    "| |",
                    " - "
            },

            //NINE - 9
            {
                    " _ ",
                    "|_|",
                    "  |",
                    " - "
            }
    };

    @Override
    public void print(Digit[] digits) {
        String[][] patterns = new String[digits.length][];

        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i].getValue();

            patterns[i] = PATTERNS[digit];
        }

        StringJoiner line1 = new StringJoiner("");
        StringJoiner line2 = new StringJoiner("");
        StringJoiner line3 = new StringJoiner("");
        StringJoiner line4 = new StringJoiner("");

        for (String[] digit : patterns) {
            line1.add(digit[0]);
            line2.add(digit[1]);
            line3.add(digit[2]);
            line4.add(digit[3]);
        }

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }
}
