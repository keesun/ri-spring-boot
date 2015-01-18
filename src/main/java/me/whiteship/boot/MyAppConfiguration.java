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

    private List<String> serverNames;

    public List<String> getServerNames() {
        return serverNames;
    }

    public void setServerNames(List<String> serverNames) {
        this.serverNames = serverNames;
    }
}
