package pl.sdacademy.designpatterns.observer;

public class ValueLoweredObserver extends Observer {

    private int previousValue;

    ValueLoweredObserver(final Subject subject) {
        super(subject);
        previousValue = subject.getValue();
    }

    @Override
    public void update() {
        if(previousValue > subject.getValue()) {
            System.out.println("Subject value changed and is now: " + subject.getValue());
        }
        previousValue = subject.getValue();
    }
}
