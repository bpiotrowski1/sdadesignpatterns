package pl.sdacademy.designpatterns.command.homework;

import lombok.Getter;
import lombok.Setter;

public class Tv {
    @Getter @Setter private int actualChannel;
    @Getter @Setter private int previousChannel;

    public Tv(final int actualChannel) {
        this.actualChannel = actualChannel;
    }

    public void switchChannel(int channel) {
        actualChannel = channel;
    }
}
