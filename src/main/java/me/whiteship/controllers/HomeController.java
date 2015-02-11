package me.whiteship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Keeun Baik
 */
@Controller
public class HomeController {

    @Autowired
    private String name;

    @RequestMapping("/")
    public @ResponseBody String home() {
        return "Hello " + name;
    }

}
