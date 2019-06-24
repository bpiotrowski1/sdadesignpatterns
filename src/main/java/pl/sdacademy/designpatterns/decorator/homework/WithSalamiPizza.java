package pl.sdacademy.designpatterns.decorator.homework;

public class WithSalamiPizza implements IPizza {
    private IPizza pizzaBase;

    public WithSalamiPizza(IPizza pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void makePizza() {
        pizzaBase.makePizza();
        addIngredient("Salami");
        System.out.println(" with Salami");
    }

    @Override
    public void addIngredient(String ingredient) {
        pizzaBase.addIngredient(ingredient);
    }
}
