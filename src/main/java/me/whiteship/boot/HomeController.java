package me.whiteship.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Keeun Baik
 */
@Controller
 public class HomeController {

    @Autowired
    MyAppConfiguration myapp;

    @RequestMapping("/")
    public @ResponseBody String home() {
        return myapp.getServerNames().toString();
    }

}
