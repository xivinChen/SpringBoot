package xyz.java1024;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mq")
public class SendController {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send")
    public String send(String msg) {
        System.out.println("send msg = " + msg);
        rabbitTemplate.convertAndSend("test",msg);
        return "success";
    }

    @GetMapping("/direct")
    public String sendToDirect(String msg) {
        rabbitTemplate.convertAndSend("directExchange","directKey",msg);
        return "SUCCESS";
    }

    @GetMapping("/fanout")
    public String sendToFanout(String msg) {
        System.out.println("sendToFanout msg = " + msg);
        rabbitTemplate.convertAndSend("fanoutExchange","keyFanout1",msg);
        return "SUCCESS";
    }

    @GetMapping("/topic")
    public String sendToTopic(String msg) {
        System.out.println("sendToTopic msg = " + msg);
        rabbitTemplate.convertAndSend("topicExchange","topic.1.listener",msg);
        return "SUCCESS";
    }


}
