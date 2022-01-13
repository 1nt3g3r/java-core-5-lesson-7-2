package digit.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNumberReader implements NumberReader {
    private String filename;

    public FileNumberReader(String filename) {
        this.filename = filename;
    }

    @Override
    public int readNumber() {
        try {
            Scanner scanner = new Scanner(new FileInputStream(filename));
            int result = scanner.nextInt();
            scanner.close();
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
