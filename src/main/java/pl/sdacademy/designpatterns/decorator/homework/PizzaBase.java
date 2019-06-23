package pl.sdacademy.designpatterns.decorator.homework;

import java.util.ArrayList;
import java.util.List;

public class PizzaBase implements IPizza {
    private List<String> base = new ArrayList<>();

    public List displayPizzaContent() {
        return base;
    }

    @Override
    public void changeBase(String newBase) {
        base.add(0, newBase);
    }
}
