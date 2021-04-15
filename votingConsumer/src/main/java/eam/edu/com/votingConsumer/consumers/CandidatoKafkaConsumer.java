package eam.edu.com.votingConsumer.consumers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eam.edu.com.votingConsumer.model.Candidato;
import eam.edu.com.votingConsumer.model.Partido;
import eam.edu.com.votingConsumer.model.msj.CandidatoMessage;
import eam.edu.com.votingConsumer.services.CandidatoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CandidatoKafkaConsumer {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private CandidatoService candidatoService;

    @KafkaListener(topics = "0iktz90d-prueba")
    public void receive(String message) throws JsonProcessingException {
        System.out.println(message);
        CandidatoMessage p = (CandidatoMessage)this.objectMapper.readValue(message, CandidatoMessage.class);
        candidatoService.create(new Candidato(p.getCodigo() , p.getNombre() ,p.getPartido(), p.getEstado()));
    }



}
