package xyz.java1024.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;
import xyz.java1024.mapper.TbUserMapper;
import xyz.java1024.vo.User1;
import xyz.java1024.vo.UserRow;

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
    private TbUserMapper userMapper;

    @Resource
    private JdbcTemplate jdbcTemplate;

    //@RequestMapping("/listByUser")
    @GetMapping("/")
    public List listByUser() {
        List query = jdbcTemplate.query("select * from user", new UserRow());
        return query;
    }

    //@RequestMapping("/getOneUser")
    @GetMapping("/{id}")
    public User1 getOneUser(@PathVariable("id") int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    //@RequestMapping("/addUser")
    @PostMapping("/")
    public int addUser(@RequestBody User1 user1) {
        return userMapper.insert(user1);
    }

    //@RequestMapping("/deleteUser")
    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable("id") int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @PutMapping("/")
    public int updateUser(@RequestBody User1 user1) {
        return userMapper.updateByPrimaryKey(user1);
    }
}
