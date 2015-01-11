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

    @Value("${my.secret}")
    private String mySecret;

    @Value("${my.number}")
    private int myNumber;

    @Value("${my.bignumber}")
    private long myBigNumber;

    @Value("${my.number.less.than.ten}")
    private int myNumberLessThanTen;

    @Value("${my.number.in.range}")
    private int myNumberInRange;

    @Autowired
    private Environment environment;

    @RequestMapping("/")
    public @ResponseBody String home() {
        return "Welcome to " + appName + ", "
                + "mySecret: " + mySecret + ". "
                + "myNumber: " + myNumber + ", "
                + "myBigNumber: " + myBigNumber + ", "
                + "myNumberLessThanTen: " + myNumberLessThanTen + ", "
                + "myNumberInRange: " + myNumberInRange;
    }

}
