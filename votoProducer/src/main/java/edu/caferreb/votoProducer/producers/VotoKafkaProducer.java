package edu.caferreb.votoProducer.producers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.caferreb.votoProducer.model.Votante;
import edu.caferreb.votoProducer.model.Voto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class VotoKafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public void sendVoto(Voto voto) throws JsonProcessingException {

        kafkaTemplate.send("0iktz90d-prueba", objectMapper.writeValueAsString(voto));

    }


}
