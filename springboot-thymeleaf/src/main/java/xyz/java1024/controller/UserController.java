package xyz.java1024.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.java1024.vo.LayuiResultData;
import xyz.java1024.vo.User;

import java.util.ArrayList;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/20
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    /**
     * 模拟分页
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/")
    public LayuiResultData<User> list(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "limit",defaultValue = "10") int limit) {

        System.out.println("page=="+page+"||| limit =="+limit);
        ArrayList<User> users = new ArrayList<>();
        int total = 1000;
        for (int i=(page-1)*limit;i<page*limit;i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("xivin_"+i);
            user.setSex("男");
            user.setCity("广州");
            user.setSign("java1024");
            user.setExperience(i);
            user.setScore(i);
            user.setClassify("程序员");
            user.setWealth(i);
            users.add(user);
        }
        LayuiResultData<User> userLayuiResultData = new LayuiResultData<>();
        userLayuiResultData.setStatus(0);
        userLayuiResultData.setMsg("ok");
        userLayuiResultData.setTotal(total);
        userLayuiResultData.setCode(0);
        userLayuiResultData.setCount(total);
        userLayuiResultData.setData(users);
        return userLayuiResultData;
    }

    /**
     * 分页参数名称 不是默认的
     * @param pageSize
     * @param pageNum
     * @return
     */
    @GetMapping("/size")
    public LayuiResultData<User> list1(@RequestParam(value = "pageSize",defaultValue = "1") int pageSize, @RequestParam(value = "pageNum",defaultValue = "10") int pageNum) {

        System.out.println("pageSize = " + pageSize);
        return this.list(pageSize,pageNum);
    }
}
