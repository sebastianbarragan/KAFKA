package edu.caferreb.votoProducer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.caferreb.votoProducer.model.Votante;
import edu.caferreb.votoProducer.services.VotanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/votantes/votante")
public class VotanteController {
    @Autowired
    private VotanteService votanteService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Votante votante) throws JsonProcessingException {
        votanteService.create(votante);

        return new ResponseEntity("Votante en creacion.", HttpStatus.ACCEPTED);
    }
}
