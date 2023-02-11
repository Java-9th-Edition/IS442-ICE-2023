public class CircularCounter extends Counter {
    private int limit;

    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;
    }

    public void decrement() {
        if (this.getValue() == 0) {
            this.setValue(limit);
        } else {
            this.setValue(this.getValue() - 1);
        }
    }

    public void increment() {
        if (this.getValue() == limit) {
            this.setValue(0);
        } else {
            this.setValue(this.getValue() + 1);
        }
    }


}
