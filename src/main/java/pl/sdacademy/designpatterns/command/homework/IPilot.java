package pl.sdacademy.designpatterns.command.homework;

public interface IPilot {
    void execute(int channel);
    void undo();
}
