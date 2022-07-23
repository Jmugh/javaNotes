package com.mq.manual_response;

import com.mq.utils.RabbitmqUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        Channel channel = RabbitmqUtils.getChannel();
        String queueName = "myq";
        channel.queueDeclare(queueName,false,false,false,null);
        System.out.println("等待接收消息");
        DeliverCallback deliverCallback  = (consumerTag,delevery)->{
            String message = new String(delevery.getBody(), "utf-8");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("接收到消息"+message);
            /**
             * 1.消息标记tag
             * 2.false 只应答接收到的消息， true 应答所有的消息
             */
            channel.basicAck(delevery.getEnvelope().getDeliveryTag(),false);
        };
        //手动应答
        boolean autoAck=false;
        channel.basicConsume(queueName,autoAck,deliverCallback,consumeTag->{});
    }
}
