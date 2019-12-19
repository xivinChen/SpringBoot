package xyz.java1024;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisApp.class)
public class RedisTemplateTest {

    @Resource
    private RedisTemplate redisTemplate;

    /**
     *
     * 介绍 如何使用 redisTemplate 操作String List Set ZSet Hash五种数据类型
     * 本测试只 使用了部分常用的 api，如在集合等复杂数据类型 有更多的api 实现更加强大的功能，查阅相关文档即可！
     *
     */

    /**
     * String 类型set
     */
    @Test
    public void testSet() {
        redisTemplate.opsForValue().set("test","this is test");
    }

    /**
     * String 类型get
     */
    @Test
    public void testGet() {
        Object test = redisTemplate.opsForValue().get("test");
        System.out.println("test = " + test);
    }

    /**
     * 添加元素
     */
    @Test
    public void testLSet() {
        redisTemplate.opsForList().leftPush("testList","testList1");
    }

    /**
     * 获取List 的所有元素
     */
    @Test
    public void testLGet() {
        List testList = redisTemplate.opsForList().range("testList", 0, -1);
        System.out.println("testList = " + testList);
    }

    /**
     * Set类型 set
     */
    @Test
    public void testSSet() {
        redisTemplate.opsForSet().add("testSet","testSet1");
    }

    /**
     * Set 类型get
     */
    @Test
    public void testSGet() {
        Set testSet = redisTemplate.opsForSet().members("testSet");
        System.out.println("testSet = " + testSet);
    }

    /**
     * hash set
     */
    @Test
    public void testHSet() {

        redisTemplate.opsForHash().put("testHash","value1","key1");
        redisTemplate.opsForHash().put("testHash","value2","key2");
    }

    /**
     * hash get
     */
    @Test
    public void testHget() {
        Object o = redisTemplate.opsForHash().get("testHash", "value1");
        System.out.println("o = " + o);
    }

    /**
     * Zset set
     */
    @Test
    public void testZSet() {
        redisTemplate.opsForZSet().add("java1024","SpringBoot",10);
        redisTemplate.opsForZSet().add("java1024","SpringCloud",3);
    }

    /**
     * Zset get
     */
    @Test
    public void testZGet() {

        // 正序
        Set all = redisTemplate.opsForZSet().range("java1024", 0, -1);
        System.out.println("all = " + all);

        //反序
        Set reverseRange = redisTemplate.opsForZSet().reverseRange("java1024", 0, -1);
        System.out.println("reverseRange = " + reverseRange);
    }
}
