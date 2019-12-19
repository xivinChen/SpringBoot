package xyz.java1024.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.java1024.mapper.UserMapper;
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
    private UserMapper userMapper;

    //@RequestMapping("/listByUser")
    @GetMapping("/")
    public List<User> listByUser() {
        return userMapper.list();
    }

    //@RequestMapping("/getOneUser")
    @GetMapping("/{id}")
    public User getOneUser(@PathVariable("id") int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    //@RequestMapping("/addUser")
    @PostMapping("/")
    public int addUser(@RequestBody User user) {
        return userMapper.insert(user);
    }

    //@RequestMapping("/deleteUser")
    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable("id") int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @PutMapping("/")
    public int updateUser(@RequestBody User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}
