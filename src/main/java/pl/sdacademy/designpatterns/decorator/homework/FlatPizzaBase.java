package pl.sdacademy.designpatterns.decorator.homework;

public class FlatPizzaBase implements IPizza {
    private IPizza pizzaBase;

    public FlatPizzaBase(IPizza pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void makePizza() {
        addIngredient("Flat");
        System.out.print("Flat ");
        pizzaBase.makePizza();
    }

    @Override
    public void addIngredient(String ingredient) {
        pizzaBase.addIngredient(ingredient);
    }
}
