package eam.edu.com.votanteConsumer.repositories;

import eam.edu.com.votanteConsumer.model.Votante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotanteRepository extends JpaRepository<Votante,String> {

}
