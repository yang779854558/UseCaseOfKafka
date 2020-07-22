package com.yhh.usecasekafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author yhh
 */
@Component
public class Producer {

    @Resource
    private KafkaTemplate<String, byte[]> kafkaTemplate;

    public void produce(byte[] bytes) {
        kafkaTemplate.send("topic", bytes);
    }

}
