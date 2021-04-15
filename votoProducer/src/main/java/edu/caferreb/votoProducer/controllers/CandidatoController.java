package edu.caferreb.votoProducer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.caferreb.votoProducer.model.Candidato;
import edu.caferreb.votoProducer.model.Votante;
import edu.caferreb.votoProducer.services.CandidatoService;
import edu.caferreb.votoProducer.services.VotanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/candidatos/candidato")
public class CandidatoController {

        @Autowired
        private CandidatoService candidatoService;

        @PostMapping
        public ResponseEntity<String> create(@RequestBody Candidato candidato) throws JsonProcessingException {
            candidatoService.create(candidato);

            return new ResponseEntity("Candidato en creacion.", HttpStatus.ACCEPTED);
        }


}
