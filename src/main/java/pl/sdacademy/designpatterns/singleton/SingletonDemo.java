package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        final Counter counterA = Counter.getInstance();
        final Counter counterB = Counter.getInstance();

        counterA.addOne();
        counterA.addTwo();
        counterA.addThree();

        counterB.addOne();
        counterB.addTwo();
        counterB.addThree();
    }
}
