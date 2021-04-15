package eam.edu.com.votingConsumer.services;

import eam.edu.com.votingConsumer.model.Candidato;
import eam.edu.com.votingConsumer.repositories.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public CandidatoService() {
    }

    public void create(Candidato candidato) {

        this.candidatoRepository.save(candidato);
    }
}
