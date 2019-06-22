package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusAfterLoggingDecorator implements IEngineStarter {
    private IEngineStarter engineStarter;

    public CarEngineStatusAfterLoggingDecorator(final IEngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        engineStarter.startEngine();
        System.out.println("Engine just started");
    }

    @Override
    public void stopEngine() {
        engineStarter.stopEngine();
        System.out.println("Engine just stopped");
    }
}
