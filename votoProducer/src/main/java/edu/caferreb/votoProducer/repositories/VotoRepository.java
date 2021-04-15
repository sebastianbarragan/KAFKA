package edu.caferreb.votoProducer.repositories;

import edu.caferreb.votoProducer.model.Voto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends CrudRepository<Voto,String> {

}
