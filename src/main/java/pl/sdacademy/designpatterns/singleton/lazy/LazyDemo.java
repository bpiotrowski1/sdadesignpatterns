package pl.sdacademy.designpatterns.singleton.lazy;

public class LazyDemo {
    public static void main(String[] args) {
        final AppConnections appConnectionsA = AppConnections.getInstance();
        final AppConnections appConnectionsB = AppConnections.getInstance();

        appConnectionsA.connectUser("qwerty");
        appConnectionsB.connectUser("ytrewq");

        appConnectionsA.getConnectedUsers().forEach(System.out::println);
    }
}
