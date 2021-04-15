package edu.caferreb.votoProducer.producers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.caferreb.votoProducer.model.Candidato;
import edu.caferreb.votoProducer.model.Votante;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CandidatoKafkaProducer {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public void sendCandidato(Candidato candidato) throws JsonProcessingException {
        kafkaTemplate.send("0iktz90d-prueba", objectMapper.writeValueAsString(candidato));
    }
}
