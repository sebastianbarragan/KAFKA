package edu.caferreb.votoProducer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.caferreb.votoProducer.model.Candidato;
import edu.caferreb.votoProducer.producers.CandidatoKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {
    @Autowired
    private CandidatoKafkaProducer candidatoProducer;


    public void create(Candidato candidato) throws JsonProcessingException {
        candidatoProducer.sendCandidato(candidato);
    }
}
