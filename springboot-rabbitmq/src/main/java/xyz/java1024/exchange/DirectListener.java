package xyz.java1024.exchange;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue("directQueues"),
        exchange = @Exchange(value = "directExchange",type = ExchangeTypes.DIRECT),
        key = "directKey"
        ))
public class DirectListener {

    @RabbitHandler
    public void handle(String msg) {
        System.out.println("direct exchange receive msg = " + msg);
    }

}
