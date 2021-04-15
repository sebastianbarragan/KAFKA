package eam.edu.com.votanteConsumer.services;

import eam.edu.com.votanteConsumer.model.Votante;
import eam.edu.com.votanteConsumer.repositories.VotanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotanteServices {

    @Autowired
    private VotanteRepository votanteRepository;

    public VotanteServices() {
    }

    public void create(Votante votante) {
        this.votanteRepository.save(votante);
    }
}
