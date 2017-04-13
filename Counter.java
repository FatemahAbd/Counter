public class Counter {

    private int value;

    public Counter() {
        value = 0;
    }

    public Counter(int initialValue) {
        value = initialValue;
    }

    public int getValue() {
        return value;
    }

    public void click() {
        value = value + 1;
    }

    public void unclick() {
        value = value - 1;
    }

    public void reset() {
        value = 0;
    }

}
