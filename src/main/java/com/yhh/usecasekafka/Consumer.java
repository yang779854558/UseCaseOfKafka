package com.yhh.usecasekafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author yhh
 */
@Component
public class Consumer {

    @KafkaListener(topics = "topic")
    public void consume1(byte[] bytes) {
        // TODO 处理逻辑
    }

}
