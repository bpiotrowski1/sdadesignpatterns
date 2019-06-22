package pl.sdacademy.designpatterns.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        final IEngineStarter engineStarter = new CarEngineStatusBeforeLoggingDecorator(new CarEngineStatusAfterLoggingDecorator(new Car()));

        engineStarter.startEngine();
        engineStarter.stopEngine();
    }
}
