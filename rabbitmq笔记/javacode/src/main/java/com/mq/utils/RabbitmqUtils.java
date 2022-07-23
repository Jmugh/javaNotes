package com.mq.utils;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitmqUtils {
    public static Channel getChannel() throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("192.168.222.132");
        connectionFactory.setUsername("root");
        connectionFactory.setPassword("123456");
        connectionFactory.setPort(15672);
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        return channel;
    }
}
