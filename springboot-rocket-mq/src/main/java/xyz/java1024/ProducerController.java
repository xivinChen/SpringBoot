package xyz.java1024;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/send")
    public String send(String msg) {
        rocketMQTemplate.convertAndSend("test_topic",msg);
        return "success";
    }
}
