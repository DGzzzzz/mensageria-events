package com.dg.mensageria_events.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopico {
    @Value("${Kafka.topico.name}")
    private String nomeTopico;

    @Bean
    public NewTopic topicTop() {
        return TopicBuilder.name(nomeTopico).partitions(1).replicas(1).build();
    }
}
