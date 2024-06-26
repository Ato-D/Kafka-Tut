package com.example.Kafka.consumer;


import com.example.Kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    /**
     * This method listens to messages from the "derrick" topic in the Kafka broker.
     * It is part of the consumer group identified by "myGroup".
     * When a message is received from the topic, it logs the message content.
     *
     * @param msg The message received from the "derrick" topic.
     * @param student The object to be deserialized to.
     */
//    @KafkaListener(topics = "derrick", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(String.format("Consuming the message from derrick Topic::: %s", msg));

    }

    @KafkaListener(topics = "derrick", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(String.format("Consuming the message from derrick Topic::: %s", student.toString()));

    }
}
