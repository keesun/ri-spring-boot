package me.whiteship.boot;

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

    @Value("${my.servers[0]}")
    private String server0;

    @Value("${my.servers[1]}")
    private String server1;

    @RequestMapping("/")
    public @ResponseBody String home() {
        return server0 + " " + server1;
    }

}
