package me.whiteship.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Keeun Baik
 */
@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public String name() {
        return "Whiteship";
    }

}
