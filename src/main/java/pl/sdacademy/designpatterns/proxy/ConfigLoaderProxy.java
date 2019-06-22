package pl.sdacademy.designpatterns.proxy;

import static java.util.Objects.isNull;

public class ConfigLoaderProxy implements IConfigLoader{
    private IConfigLoader configLoader;
    private String config;

    public ConfigLoaderProxy(final IConfigLoader configLoader) {
        this.configLoader = configLoader;
    }

    @Override
    public String load() {
        if(isNull(config)) {
            config = configLoader.load();
        }
        return config;
    }
}
