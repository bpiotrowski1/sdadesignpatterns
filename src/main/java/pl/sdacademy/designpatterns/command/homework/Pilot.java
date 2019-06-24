package pl.sdacademy.designpatterns.command.homework;

public class Pilot implements IPilot {

    private Tv tv;

    public Pilot(final Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute(int channel) {
        tv.setPreviousChannel(tv.getActualChannel());
        tv.switchChannel(channel);
    }

    @Override
    public void undo() {
        int channel = tv.getActualChannel();
        tv.switchChannel(tv.getPreviousChannel());
        tv.setPreviousChannel(channel);
    }
}
