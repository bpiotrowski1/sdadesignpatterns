package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

    private int previousValue;

    ByTenChangedObserver(final Subject subject) {
        super(subject);
        previousValue = subject.getValue();
    }

    @Override
    public void update() {
        if(Math.abs(previousValue - subject.getValue()) >= 10) {
            System.out.println("Subject value changed and is now: " + subject.getValue());
        }
        previousValue = subject.getValue();
    }
}
