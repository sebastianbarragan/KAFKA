package eam.edu.com.votanteConsumer.consumers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eam.edu.com.votanteConsumer.model.Votante;
import eam.edu.com.votanteConsumer.model.msj.VotanteMessage;
import eam.edu.com.votanteConsumer.services.VotanteServices;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class VotantesKafkaConsumer {
    @Autowired
    private VotanteServices votanteService;
    @Autowired
    private ObjectMapper objectMapper;


    @KafkaListener(topics = "0iktz90d-prueba")
    public void receive(String message) throws JsonProcessingException {
        System.out.println(message);
        VotanteMessage p = (VotanteMessage)this.objectMapper.readValue(message, VotanteMessage.class);

        votanteService.create(new Votante(p.getId() , p.getNombrevotante() ,p.isCambio()==true, p.getPuestovotacion()));
        System.out.println(message);
    }


}
