package xyz.java1024.exchange;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * 广播模式
 * 不会匹配route key
 */

@Component
@RabbitListeners({
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fanoutQueus1"),
            exchange = @Exchange(value = "fanoutExchange",type = ExchangeTypes.FANOUT),
            key = "keyFanout1"
    )),
        @RabbitListener(bindings = @QueueBinding(
                value = @Queue("fanoutQueus2"),
                exchange = @Exchange(value = "fanoutExchange",type = ExchangeTypes.FANOUT),
                key = "keyFanout2"
        )),

})
public class FanoutExchange {

    @RabbitHandler
    public void handle(@Payload String msg) {
        System.out.println(" consumer 1 fanout exchange receivce from  msg = " + msg);
    }
}
