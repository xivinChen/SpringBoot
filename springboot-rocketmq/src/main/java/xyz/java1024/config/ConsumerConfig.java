package xyz.java1024.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/10/16 18:32
 * @description：
 * @email : 1250402127@qq.com
 */
@Configuration
@Slf4j
public abstract class ConsumerConfig {

    @Value(value = "${rocketmq.producer.namesrvAddr}")
    private String namesrvAddr;
    @Value(value = "${rocketmq.producer.groupName}")
    private String groupName;

    public void listener(String topic, String tag) throws MQClientException {

        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(groupName);
        consumer.setNamesrvAddr(namesrvAddr);
        consumer.subscribe(topic,tag);
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {

                dealBody(list);
                return null;
            }
        });

    }

    public abstract ConsumeConcurrentlyStatus dealBody(List<MessageExt> msgs);
}
