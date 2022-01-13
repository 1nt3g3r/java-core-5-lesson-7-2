package digit.input;

public class NumberReaderTests {
    public static void main(String[] args) {
        NumberReader reader = new KeyboardNumberReader();

        System.out.println(reader.readNumber());
    }
}
