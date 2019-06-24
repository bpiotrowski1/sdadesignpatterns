package pl.sdacademy.designpatterns.decorator.homework;

public class FlatPizzaBase {
    private IPizza pizzaBase;

    public FlatPizzaBase(IPizza pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void makePizza() {
        System.out.print("Flat ");
        pizzaBase.makePizza();
    }
}
