package xyz.java1024.springboothello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/19
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String hello() {
        return "hello Spring Boot!";
    }
}
