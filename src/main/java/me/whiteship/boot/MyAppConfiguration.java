package me.whiteship.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Keeun Baik
 */
@Component
@ConfigurationProperties("wow")
public class MyAppConfiguration {

    private List<WowServer> servers;

    public List<WowServer> getServers() {
        return servers;
    }

    public void setServers(List<WowServer> servers) {
        this.servers = servers;
    }
}
