package com.laibao.simplewebflux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author laibao wang
 * @date 2018-01-17
 * @version 1.0
 */
@Controller
public class HelloWorldController {

    @RequestMapping
    @ResponseBody
    public String indexPage() {
        return "Hello World ,Web MVC!";
    }
}
