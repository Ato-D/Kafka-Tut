package com.example.Kafka.producer;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    /**
     * Sends a message to the Kafka topic named "derrick".
     * Logs the message being sent.
     *
     * @param msg the message to be sent to the "derrick" topic
     */
    public void sendMessage(String msg) {
        log.info(String.format("Sending Message To derrick Topic:: %s", msg));

        kafkaTemplate.send("derrick", msg);
    }
}
