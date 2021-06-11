package com.icbc.group4.mq;

/**
 * @Author: Chris he
 * @Date: 2020/7/31 17:35
 */
import java.util.Map;

import com.mydeo.seckilldemo.config.druid.MQConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//生产者
@Service
public class MQSender {

    @Autowired
    AmqpTemplate amqpTemplate;

    //Direct模�?
    public void send(Map<String,Object> msg) {
        //第一个�?�数队列的�??字，第二个�?�数�?�出的信�?�
        amqpTemplate.convertAndSend(MQConfig.QUEUE, msg);
    }

}
