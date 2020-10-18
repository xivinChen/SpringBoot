package xyz.java1024;


import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@RabbitListener(queues = "test")
public class ConsumerMqConfig {


    @RabbitHandler
    public void handle(String msg, Channel channel, Message message) {
        System.out.println("收到的 msg = " + msg);
        try {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),true);

            System.out.println(" ack success tags ="+message.getMessageProperties().getDeliveryTag());
            //Thread.sleep(10000);
            System.out.println("threed complish ");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
