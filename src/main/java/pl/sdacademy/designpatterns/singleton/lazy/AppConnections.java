package pl.sdacademy.designpatterns.singleton.lazy;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {
    @Getter private static AppConnections appConnections;
    @Getter private List<String> connectedUsers;
    @Getter private long timeout;
    @Getter private int currentConnectionsNum = 0;

    private AppConnections() {
        connectedUsers = new ArrayList<>();
    }

    public static AppConnections getInstance() {
        /* DOUBLE CHECKED
        if(appConnections == null) {
            synchronized(AppConnections.class) {
                if(appConnections == null) {
                    appConnections = new AppConnections();
                }
            }
        }
         */
        if(appConnections == null) {
            appConnections = new AppConnections();
            System.out.println("Initialized AppConnections");
        }
        return appConnections;
    }

    public void connectUser(String username) {
        currentConnectionsNum++;
        connectedUsers.add(username);
    }
}
