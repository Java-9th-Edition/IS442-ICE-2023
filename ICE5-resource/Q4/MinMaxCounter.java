public class MinMaxCounter extends Counter{
    private int min;
    private int max;

    public MinMaxCounter(int min, int max) {
        super(min);
        this.min = min;
        this.max = max;
    }

    public void increment() {
        if (this.getValue() == this.max) {
            this.setValue(this.max);
        } else {
            this.setValue(this.getValue() + 1);
        }
    }

    public void decrement() {
        if (this.getValue() == this.min) {
            this.setValue(this.min);
        } else {
            this.setValue(this.getValue() - 1);
        }
    }
}
