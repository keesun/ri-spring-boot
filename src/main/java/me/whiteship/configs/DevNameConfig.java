package me.whiteship.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Keeun Baik
 */
@Configuration
@Profile("dev_name")
public class DevNameConfig {

    @Bean
    public String name() {
        return "Keesun";
    }

}
