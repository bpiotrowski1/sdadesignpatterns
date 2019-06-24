package pl.sdacademy.designpatterns.decorator.homework;

public class WithHamPizza implements IPizza {
    private IPizza pizzaBase;

    public WithHamPizza(IPizza pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void makePizza() {
        pizzaBase.makePizza();
        addIngredient("Ham");
        System.out.println(" with Ham");
    }

    @Override
    public void addIngredient(String ingredient) {
        pizzaBase.addIngredient(ingredient);
    }
}
