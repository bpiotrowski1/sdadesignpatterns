package pl.sdacademy.designpatterns.observer;

public abstract class Observer {

    Subject subject;

    Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    public abstract void update();
}
