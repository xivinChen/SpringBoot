package xyz.java1024;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/19
 */
@SpringBootApplication
@MapperScan("xyz.java1024.mapper")
public class SMMApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(SMMApp.class,args);
    }
}
