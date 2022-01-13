package digit;

public enum Digit {
    zero(0),
    one(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9);

    private int value;

    Digit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int plus(Digit another) {
        return value + another.getValue();
    }

    public static Digit valueOf(int digit) {
        return values()[digit];
    }
}
