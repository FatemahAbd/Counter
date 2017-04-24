public class Counter {
//a ad for variable (type: integer), we make it private to see it inside this class not outside it
    private int value;
//we make a constractor (without an initial value) to allow us make an object from it in another class but it would be in the same package
    public Counter() {
        value = 0;
    }
//we make a constractor (with initial value)
    public Counter(int initialValue) {
        value = initialValue;
    }
//a method called getValue (type: int) which return the value
    public int getValue() {
        return value;
    }
//a method called click (type: void, it means return nothing), this methos just add one to the value when you call it
    public void click() {
        value = value + 1;
    }
//a method called unclick (type: void, it means return nothing), this methos just decrease one of the value when you call it
    public void unclick() {
        value = value - 1;
    }
//a method called reset (type: void, it means return nothing), this methos just make the value zero when you call it
    public void reset() {
        value = 0;
    }

}
