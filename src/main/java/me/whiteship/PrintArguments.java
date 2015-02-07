package me.whiteship;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Keeun Baik
 */
@Component
@Order(1)
public class PrintArguments implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
