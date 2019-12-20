package xyz.java1024.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description java1024 redis template
 * @date 2019/12/19
 */

public class Java1024RedisTemplate {

    @Autowired
    private RedisTemplate redisTemplate;

    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
