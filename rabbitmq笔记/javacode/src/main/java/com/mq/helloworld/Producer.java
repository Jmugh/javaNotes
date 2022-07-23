package com.mq.helloworld;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
public class Producer {
    private final static  String QUEUE_NAME="myqueue";
    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        //创建一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.222.132");
        factory.setUsername("root");
        factory.setPassword("123456");
        //channel 实现了自动 close 接口 自动关闭 不需要显示关闭
        try(Connection connection = factory.newConnection();Channel channel =
                connection.createChannel()) {

            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            String message = "hello world";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("消息发送完毕");
            Thread.sleep(10000);
        }
    }
}
