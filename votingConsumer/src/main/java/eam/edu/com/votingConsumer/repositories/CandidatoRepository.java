package eam.edu.com.votingConsumer.repositories;

import eam.edu.com.votingConsumer.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CandidatoRepository extends JpaRepository<Candidato,String> {

}
