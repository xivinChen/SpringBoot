package xyz.java1024.exchange;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


/**
 * 广播模式
 */

@Component
@RabbitListeners({
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fanoutQueus3"),
            exchange = @Exchange(value = "fanoutExchange",type = ExchangeTypes.FANOUT),
            key = "keyFanout3"
    )),
        @RabbitListener(bindings = @QueueBinding(
                value = @Queue("fanoutQueus4"),
                exchange = @Exchange(value = "fanoutExchange",type = ExchangeTypes.FANOUT),
                key = "keyFanout4"
        )),

})
public class FanoutExchangeOther {

    @RabbitHandler
    public void handle(@Payload String msg) {
        System.out.println(" consumer other fanout exchange receivce from  msg = " + msg);
    }
}
