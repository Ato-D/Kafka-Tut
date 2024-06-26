package com.example.Kafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    /**
     * Creates a Kafka topic named "derrick" as a Spring Bean.
     *
     * @return a NewTopic instance for the topic "derrick"
     */
    @Bean
    public NewTopic biggestTopic() {
        return TopicBuilder
                .name("derrick")
                .build();

    }
}
