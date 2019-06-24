package pl.sdacademy.designpatterns.decorator.homework;

public class WithMushroomPizza implements IPizza {
    private IPizza pizzaBase;

    public WithMushroomPizza(IPizza pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void makePizza() {
        pizzaBase.makePizza();
        addIngredient("Mushroom");
        System.out.println(" with Mushroom");
    }

    @Override
    public void addIngredient(String ingredient) {
        pizzaBase.addIngredient(ingredient);
    }
}
