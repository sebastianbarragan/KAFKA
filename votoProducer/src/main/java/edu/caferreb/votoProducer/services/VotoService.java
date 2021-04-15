package edu.caferreb.votoProducer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.caferreb.votoProducer.model.Votante;
import edu.caferreb.votoProducer.model.Voto;
import edu.caferreb.votoProducer.producers.VotanteKafkaProducer;
import edu.caferreb.votoProducer.producers.VotoKafkaProducer;
import edu.caferreb.votoProducer.repositories.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VotoService {
    @Autowired //injectar la dependencia
    private VotoRepository votoRepository;
    @Autowired //injectar la dependencia
    private VotoKafkaProducer votoProducer;

    public void create(Voto voto) throws JsonProcessingException {

        Optional<Voto> nombres = votoRepository.findById(voto.getCedula_votante());

      //  if (!nombres.isEmpty()) {
           // throw new RuntimeException("Este partido ya esta usado...");
        //}

        votoRepository.save(voto);
        votoProducer.sendVoto(voto);

        }

    }



