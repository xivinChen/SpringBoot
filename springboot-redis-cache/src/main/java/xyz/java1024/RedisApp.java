package xyz.java1024;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/19
 */
@SpringBootApplication
@MapperScan("xyz.java1024.mapper")
@EnableCaching
public class RedisApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(xyz.java1024.RedisApp.class,args);
    }
}
