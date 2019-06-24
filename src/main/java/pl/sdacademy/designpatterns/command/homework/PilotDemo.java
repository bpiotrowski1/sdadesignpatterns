package pl.sdacademy.designpatterns.command.homework;

public class PilotDemo {
    public static void main(String[] args) {
        final Tv tv = new Tv(5);
        final IPilot pilot = new Pilot(tv);

        System.out.println("TV actual channel is: " + tv.getActualChannel());
        pilot.execute(8);
        System.out.println("TV actual channel is: " + tv.getActualChannel());
        pilot.undo();
        System.out.println("TV actual channel is: " + tv.getActualChannel());
        pilot.undo();
        System.out.println("TV actual channel is: " + tv.getActualChannel());
    }
}
