package pl.sdacademy.designpatterns.decorator.homework;

public class PizzaDemo {
    public static void main(String[] args) {
        final IPizza pizzaBaseA = new ThickPizzaBase(new WithHamPizza(new PizzaBase()));
        final IPizza pizzaBaseB = new FlatPizzaBase(new WithSalamiPizza(new PizzaBase()));

        pizzaBaseA.makePizza();
        pizzaBaseB.makePizza();
    }
}
