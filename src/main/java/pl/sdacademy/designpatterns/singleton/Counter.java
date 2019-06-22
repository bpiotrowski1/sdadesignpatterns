package pl.sdacademy.designpatterns.singleton;

public class Counter {
    private static Counter counter = new Counter();
    private int value = 0;

    private Counter() {
    }

    public static Counter getInstance() {
        return counter;
    }

    public void addOne() {
        value++;
        System.out.println("Value is now: " + value);
    }

    public void addTwo() {
        value += 2;
        System.out.println("Value is now: " + value);
    }

    public void addThree() {
        value += 3;
        System.out.println("Value is now: " + value);
    }
}
