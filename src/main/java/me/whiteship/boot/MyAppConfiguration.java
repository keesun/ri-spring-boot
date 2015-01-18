package me.whiteship.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Keeun Baik
 */
@ConfigurationProperties("myapp")
public class MyAppConfiguration {

    private String name;

    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
