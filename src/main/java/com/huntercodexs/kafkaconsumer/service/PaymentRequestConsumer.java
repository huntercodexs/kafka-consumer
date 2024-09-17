package com.huntercodexs.kafkaconsumer.service;

import com.huntercodexs.kafkaconsumer.record.PaymentRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class PaymentRequestConsumer {

    @KafkaListener(
            topicPartitions = @TopicPartition(
                    topic = "${topics.payment.request.topic}",
                    partitions = {"0"}
            ),
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void consumer(PaymentRecord payment) {
        System.out.println("Message Received from partition 0: " + payment.description());
    }

}
