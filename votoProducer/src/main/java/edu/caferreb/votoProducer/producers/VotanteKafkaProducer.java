package edu.caferreb.votoProducer.producers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.caferreb.votoProducer.model.Votante;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class VotanteKafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public void sendVotante(Votante votante) throws JsonProcessingException {

        kafkaTemplate.send("0iktz90d-prueba", objectMapper.writeValueAsString(votante));

    }
}
