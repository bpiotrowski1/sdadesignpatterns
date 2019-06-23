package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class CombiCarFactory implements AbstractFactory<Car> {

    // TC - toyota corolla combi - 2.0 engine
    // A4 - audi a4 combi - 2.5 engine

    @Override
    public Car create(final String type) throws Exception {
        switch (type) {
            case "TC":
                return createCorollaCombi();
            case "A4":
                return createA4Combi();
        }
        throw new RuntimeException("Unknown combi type");
    }

    private Car createCorollaCombi() {
        return new Toyota("Corolla", EngineType.GASOLINE_TURBO, 2.0, 4, BodyType.COMBI);
    }

    private Car createA4Combi() {
        return new Audi("A4", EngineType.DIESEL, 2.5D, 4, BodyType.COMBI);
    }
}
