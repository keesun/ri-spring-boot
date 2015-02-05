package me.whiteship;

import me.whiteship.eventhandlers.MyAppStartedHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Keeun Baik
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addListeners(new MyAppStartedHandler());
        application.run(args);
    }
}
