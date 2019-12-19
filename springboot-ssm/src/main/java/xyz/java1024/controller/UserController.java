package xyz.java1024.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.java1024.mapper.UserMapper;
import xyz.java1024.vo.User;

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

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/listByUser")
    public List<User> listByUser() {
        return userMapper.list();
    }

    @RequestMapping("/getOneUser")
    public User getOneUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("/addUser")
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @RequestMapping("/deleteUser")
    public int deleteUser(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

}
