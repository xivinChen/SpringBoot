package xyz.java1024.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.java1024.mapper.UserMapper;
import xyz.java1024.service.UserService;
import xyz.java1024.vo.User;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    //@RequestMapping("/listByUser")
    @GetMapping("/")
    public List<User> listByUser() {
        return userService.findAll();
    }

    //@RequestMapping("/getOneUser")
    @GetMapping("/{id}")
    public User getOneUser(@PathVariable("id") int id) {
        return userService.getOneUser(id);
    }

    //@RequestMapping("/addUser")
    @PostMapping("/")
    public int addUser(@RequestBody User user) {
        return userService.add(user);
    }

    //@RequestMapping("/deleteUser")
    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @PutMapping("/")
    public int updateUser(@RequestBody User user) {
        return userService.update(user);
    }
}
