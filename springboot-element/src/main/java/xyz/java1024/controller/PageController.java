package xyz.java1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/8/3 18:01
 * @description：
 * @email : 1250402127@qq.com
 */
@Controller
@RequestMapping("/page/")
public class PageController {

    @RequestMapping(value = "/{page}.html",method = RequestMethod.GET)
    public ModelAndView page(@PathVariable("page") String page) {

        System.out.println("进入 page");
        ModelAndView modelAndView = new ModelAndView(page);
        return modelAndView;

    }

    public static void main(String[] args) {
        String string = "123456";
        System.out.println(string.charAt(0));
    }

}
