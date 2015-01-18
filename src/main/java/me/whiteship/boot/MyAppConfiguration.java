package me.whiteship.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Keeun Baik
 */
@Component
@ConfigurationProperties("wow")
public class MyAppConfiguration {

    private WowServer server;

    public WowServer getServer() {
        return server;
    }

    public void setServer(WowServer server) {
        this.server = server;
    }
}
