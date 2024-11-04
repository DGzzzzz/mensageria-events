package com.dg.mensageria_events.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ServiceKafka {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${Kafka.topico.name}")
    private String nomeTopico;

    public void enviarMensagem(String mensagem) {

        System.out.println("Mensagem: " + mensagem);

        kafkaTemplate.send(nomeTopico, mensagem);
    }
}
