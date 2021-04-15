package edu.caferreb.votoProducer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.caferreb.votoProducer.model.Votante;
import edu.caferreb.votoProducer.producers.VotanteKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotanteService  {

    @Autowired
    private VotanteKafkaProducer votanteProducer;



    public void create(Votante votante) throws JsonProcessingException {
        votanteProducer.sendVotante(votante);
    }

}
