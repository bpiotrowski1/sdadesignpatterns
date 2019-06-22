package pl.sdacademy.designpatterns.decorator;

public class Car implements IEngineStarter {
    private boolean engineStarted;

    @Override
    public void startEngine() {
        this.engineStarted = true;
    }

    @Override
    public void stopEngine() {
        this.engineStarted = false;
    }

}
