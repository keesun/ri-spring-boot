package me.whiteship.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Keeun Baik
 */
@Configuration
@Profile("dev_server")
public class DevServerConfig {

    @Bean
    public String serverUrl() {
        return "//localhost:8080/";
    }
}
