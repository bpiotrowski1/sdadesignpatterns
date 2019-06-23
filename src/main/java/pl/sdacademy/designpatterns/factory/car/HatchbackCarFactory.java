package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class HatchbackCarFactory implements AbstractFactory<Car> {

    // TC - toyota corolla hatchback - 2.2 engine
    // A4 - audi a3 hatchback - 3.0 engine

    @Override
    public Car create(final String type) throws Exception {
        switch (type) {
            case "TC" :
                return createCorollaHatchback();
            case "A3":
                return createA3Hatchback();
        }
        throw new RuntimeException("Unknown hatchback type");
    }

    private Car createCorollaHatchback() {
        return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED, 2.2, 4, BodyType.HATCHBACK);
    }

    private Car createA3Hatchback() {
        return new Audi("A3", EngineType.DIESEL, 3.0D, 4, BodyType.HATCHBACK);
    }
}
