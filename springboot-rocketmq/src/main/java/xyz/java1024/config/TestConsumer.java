package xyz.java1024.config;


import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;

/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/10/16 18:39
 * @description：
 * @email : 1250402127@qq.com
 */
@Slf4j
@Configuration
public class TestConsumer extends ConsumerConfig implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        try {
            super.listener("test_topic","test_tag");
            log.info(" consumer test_topic success");
        }catch (Exception e) {
            log.error(" consumer fail ,e => {}",e.getMessage());
        }
    }

    @Override
    public ConsumeConcurrentlyStatus dealBody(List<MessageExt> msgs) {
        int num = 1;
        for (MessageExt msg : msgs) {

            log.info(" 第 {} 次消息 ",num);
            try {
                String body = new String(msg.getBody(), "utf-8");
                log.info(" consumer body => {}", body);
            }catch (Exception e) {
                log.error(" consumer parse body fail");
            }
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}
