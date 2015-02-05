package me.whiteship.eventhandlers;

import me.whiteship.AppBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Keeun Baik
 */
public class MyAppStartedHandler implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        SpringApplication springApplication = event.getSpringApplication();
        springApplication.setBanner(new AppBanner());
    }
}
