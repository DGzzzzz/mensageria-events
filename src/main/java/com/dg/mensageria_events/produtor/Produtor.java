package com.dg.mensageria_events.produtor;

import com.dg.mensageria_events.service.ServiceKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class Produtor {

    @Autowired
    private ServiceKafka serviceKafka;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem) {
        serviceKafka.enviarMensagem(mensagem);
    }
}
