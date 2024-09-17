package com.huntercodexs.kafkaconsumer.messager;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentRequestConsumer {

    @KafkaListener(
            topics = "${topics.payment.request.topic}",
            groupId = "payment-request-consumer-1"
    )
    public void consumer(String message) {
        System.out.println("Message Received: " + message);
    }

}
