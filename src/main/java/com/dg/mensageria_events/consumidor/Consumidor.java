package com.dg.mensageria_events.consumidor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumidor {

    @KafkaListener(topics = "${Kafka.topico.name}", groupId = "grupo")
    public void consumidor(String mensagem) {
        System.out.println("============================= RECEBENDO MENSAGEM =============================");
        System.out.println("============================= " + mensagem + " =============================");
        System.out.println("============================= FIM DA MENSAGEM =============================");
    }
}
