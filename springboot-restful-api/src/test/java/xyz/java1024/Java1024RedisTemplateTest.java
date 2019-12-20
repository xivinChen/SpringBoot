package xyz.java1024;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.java1024.autoconfigure.Java1024RedisTemplate;

import javax.annotation.Resource;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class Java1024RedisTemplateTest {

    @Resource
    private Java1024RedisTemplate java1024RedisTemplate;

    @Resource
    private RedisTemplate redisTemplate;


    @Test
    public void testget() {
        //Object test = java1024RedisTemplate.get("test");
        Object test = redisTemplate.opsForValue().get("test");
        System.out.println("test = " + test);
    }
}
