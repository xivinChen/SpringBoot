package xyz.java1024.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/10/16 13:53
 * @description：
 * @email : 1250402127@qq.com
 */
@Component
@Slf4j
public class ProducerConfig {

    @Value(value = "${rocketmq.producer.namesrvAddr}")
    private String namesrvAddr;
    @Value(value = "${rocketmq.producer.groupName}")
    private String groupName;

    @Bean
    public DefaultMQProducer defaultMQProducer() throws MQClientException {

        log.info(" 开始建立 rocketmq 连接 ");
        DefaultMQProducer defaultMQProducer = new DefaultMQProducer(groupName);
        defaultMQProducer.setNamesrvAddr(namesrvAddr);
        defaultMQProducer.setVipChannelEnabled(false);
        defaultMQProducer.start();

        log.info(" 建立 rocketmq 连接 成功 ");
        log.info(" producer info => {}",defaultMQProducer);
        return defaultMQProducer;

    }


}
