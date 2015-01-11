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

    @Value("${application.name}")
    private String applicationName;

    @RequestMapping("/")
    public @ResponseBody String home() {
        return "Welcome to " + applicationName;
    }

}
