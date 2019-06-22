package pl.sdacademy.designpatterns.proxy;

public class DatabaseConfigLoader implements IConfigLoader {
    private String configuration;
    private String serverUrl;

    public DatabaseConfigLoader(final String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Override
    public String load() {
        System.out.println("Getting config from " + serverUrl);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        configuration = "Config loaded from " + serverUrl;
        return configuration;
    }
}
