package xyz.java1024.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/10/16 14:14
 * @description：
 * @email : 1250402127@qq.com
 */
@RestController
@Slf4j
@RequestMapping("/producer")
public class ProducerController {

    @Resource
    private DefaultMQProducer defaultMQProducer;

    @GetMapping("/send_msg")
    public String testSendMsg() {

        Message message = new Message("test_topic", "test_tag", "test_key", "test message".getBytes());
        try {

            defaultMQProducer.send(message,10000);
            return "success";
        }catch (Exception e) {
            log.error(" send mq has exception => {}",e.getMessage());
            return "fail";
        }

    }
}
