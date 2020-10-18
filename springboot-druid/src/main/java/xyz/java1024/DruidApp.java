package xyz.java1024;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("xyz.java1024.mapper")
public class DruidApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(DruidApp.class,args);
    }
}
