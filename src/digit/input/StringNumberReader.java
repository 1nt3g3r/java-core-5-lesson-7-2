package digit.input;

public class StringNumberReader implements NumberReader {
    private String line;

    public StringNumberReader(String line) {
        this.line = line;
    }

    @Override
    public int readNumber() {
        return Integer.parseInt(line);
    }
}
