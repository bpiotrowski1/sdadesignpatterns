package pl.sdacademy.designpatterns.decorator.homework;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class PizzaBase implements IPizza {
    @Getter private List<String> base = new ArrayList<>();

    public List displayPizzaContent() {
        return base;
    }

    @Override
    public void makePizza() {
        addIngredient("Pizza");
        System.out.print("Pizza");
    }

    @Override
    public void addIngredient(String ingredient) {
        base.add(ingredient);
    }
}
