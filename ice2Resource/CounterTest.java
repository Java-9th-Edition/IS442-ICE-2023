// this is for Q8
public class CounterTest {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter();
        System.out.println("firstCounter before: " + firstCounter.getValue());
        System.out.println("secondCounter before: " + secondCounter.getValue());

        for (int i = 0; i < 5; i++) {
            firstCounter.increment();
        }

        secondCounter.decrement();

        System.out.println("firstCounter after: " + firstCounter.getValue());
        System.out.println("secondCounter after: " + secondCounter.getValue());

        secondCounter.reset();

        System.out.println("secondCounter reset: " + secondCounter.getValue());
    }


}