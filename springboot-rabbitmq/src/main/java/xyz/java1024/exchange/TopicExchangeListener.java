package xyz.java1024.exchange;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicExchangeListener {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("topicQueues1"),
            exchange = @Exchange(value = "topicExchange",type = ExchangeTypes.TOPIC),
            key = "topic.#"
    ))
    public void handle1(String msg) {
        System.out.println(" topic recevice handler topic.# msg = " + msg);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("topicQueues2"),
            exchange = @Exchange(value = "topicExchange",type = ExchangeTypes.TOPIC),
            key = "topic.1.#"
    ))
    public void handle2(String msg) {
        System.out.println(" topic recevice handler topic.2.# msg = " + msg);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("topicQueues3"),
            exchange = @Exchange(value = "topicExchange",type = ExchangeTypes.TOPIC),
            key = "topic.*"
    ))
    public void handle3(String msg) {
        System.out.println(" topic recevice handler topic.* msg = " + msg);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("topicQueues4"),
            exchange = @Exchange(value = "topicExchange",type = ExchangeTypes.TOPIC),
            key = "#.listener"
    ))
    public void handle4(String msg) {
        System.out.println(" topic recevice handler *.listener msg = " + msg);
    }
}
