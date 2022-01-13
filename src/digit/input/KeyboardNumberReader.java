package digit.input;

import java.util.Scanner;

public class KeyboardNumberReader implements NumberReader {
    @Override
    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        scanner.close();
        return result;
    }
}
