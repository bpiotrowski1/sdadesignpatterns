package pl.sdacademy.designpatterns.decorator.homework;

public class WithCheesePizza implements IPizza {
    private IPizza pizzaBase;

    public WithCheesePizza(IPizza pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void makePizza() {
        pizzaBase.makePizza();
        addIngredient("Cheese");
        System.out.println(" with Cheese");
    }

    @Override
    public void addIngredient(String ingredient) {
        pizzaBase.addIngredient(ingredient);
    }
}
