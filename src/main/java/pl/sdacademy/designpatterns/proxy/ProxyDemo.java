package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        final IConfigLoader configLoader = new ConfigLoaderProxy(new DatabaseConfigLoader("jdbs:h2:mem:testdb"));

        configLoader.load();
        System.out.println("X");
        configLoader.load();
        System.out.println("X");
        configLoader.load();
        System.out.println("X");
    }
}
