package pl.sdacademy.designpatterns.decorator.homework;

public class PizzaDemo {
    public static void main(String[] args) {
        //final IEngineStarter engineStarter = new CarEngineStatusBeforeLoggingDecorator(new CarEngineStatusAfterLoggingDecorator(new Car()));
        final IPizza pizzaBase = new ThickPizzaBase(new WithCheesePizza(new PizzaBase()));

        pizzaBase.makePizza();
    }
}
