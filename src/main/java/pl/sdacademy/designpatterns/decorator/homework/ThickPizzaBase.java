package pl.sdacademy.designpatterns.decorator.homework;

public class ThickPizzaBase implements IPizza {
    private IPizza pizzaBase;

    public ThickPizzaBase(IPizza pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public void makePizza() {
        addIngredient("Thick");
        System.out.print("Thick ");
        pizzaBase.makePizza();
    }

    @Override
    public void addIngredient(String ingredient) {
        pizzaBase.addIngredient(ingredient);
    }
}