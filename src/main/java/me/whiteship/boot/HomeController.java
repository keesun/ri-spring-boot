package me.whiteship.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Keeun Baik
 */
@Controller
public class HomeController {

    @Value("${myapp.name}")
    private String name;

    @Value("${myapp.greeting}")
    private String greeting;

    @Value("${myapp.message}")
    private String message;


    @RequestMapping("/")
    public @ResponseBody String home() {
        return greeting + " " + name + " " + message;
    }

}
