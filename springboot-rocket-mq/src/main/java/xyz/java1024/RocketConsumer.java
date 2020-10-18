package xyz.java1024;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(consumerGroup = "test_rocktmq_group", topic = "test_topic")
public class RocketConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        System.err.println("接收到消息：" + message);
    }
}
