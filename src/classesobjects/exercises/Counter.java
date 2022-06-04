package classesobjects.exercises;

public class Counter {

    private int value;

    public Counter() {
    }

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increaseValue() {
        value += 1;
    }

    public void decreaseValue() {
        value -= 1;
    }

    public void resetValue() {
        value = 0;
    }

    public static void main(String[] args) {
        Counter c = new Counter(5);
        c.increaseValue();
        c.increaseValue();
        System.out.println(c.getValue());
    }

}
