package com.icbc.group4.mq;

/**
 * @Author: Ryan Z
 * @Date: 2021/6/12 17:36
 */
import java.util.List;
import java.util.Map;

import com.mydeo.seckilldemo.config.druid.MQConfig;
import com.mydeo.seckilldemo.service.MiaoshaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//消费者
@Service
public class MQReceiver {

    @Autowired
    private MiaoshaService miaoshaService;

    private static Logger log = LoggerFactory.getLogger(MQReceiver.class);

    @RabbitListener(queues= MQConfig.QUEUE)//指明监�?�的是哪一个queue
    public void receive(Map<String,Object> msg) {
        //log.info("监�?�到队列消�?�,用户id为：{}，商�?id为：{},购买数�?:{}", msg.get("user_id"),msg.get("goods_id"),msg.get("num"));
        int stock = 0;
        //查数�?�库中商�?库存
        Map<String, Object> m = miaoshaService.queryGoodStockById(msg);
        if(m != null && m.get("goods_stock") != null){
            stock = Integer.parseInt(m.get("goods_stock").toString());
        }
        if(stock <= 0){//库存�?足
            log.info("用户：{}秒�?�时商�?的库存�?没有剩余,秒�?�结�?�", msg.get("user_id"));
            return;
        }
        //这里业务是�?�一用户�?�一商�?�?�能购买一次,所以判断该商�?用户是�?�下过�?�
//        List<Map<String, Object>> list = miaoshaService.queryOrderByUserIdAndCoodsId(msg);
//        if(list != null && list.size() > 0){//�?�?下�?�
//            return;
//        }
        //�?库存,下订�?�
        log.info("用户：{}秒�?�该商�?：{}库存有余:{},�?�以进行下订�?��?作", msg.get("user_id"),msg.get("goods_id"),stock);
        miaoshaService.miaosha(msg);
    }

}
