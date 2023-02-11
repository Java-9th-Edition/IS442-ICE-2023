public class Counter {
    private int value;
    protected Counter( int value ) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void setValue(int value ) {
        this.value = value;
    }

}
