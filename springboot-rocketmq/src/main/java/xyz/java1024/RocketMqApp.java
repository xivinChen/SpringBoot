package xyz.java1024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class RocketMqApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(RocketMqApp.class);
    }

}
