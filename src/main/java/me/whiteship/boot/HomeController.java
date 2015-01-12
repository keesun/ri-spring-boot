package me.whiteship.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Keeun Baik
 */
@Controller
public class HomeController {

    @Value("${myapp.name}")
    private String appName;

    @Value("${myapp.greeting}")
    private String greeting;

    @Autowired
    private Environment environment;

    @RequestMapping("/")
    public @ResponseBody String home() {
        return greeting + " " + appName;
    }

}
