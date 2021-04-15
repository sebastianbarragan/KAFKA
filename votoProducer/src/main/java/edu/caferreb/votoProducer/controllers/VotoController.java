package edu.caferreb.votoProducer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.caferreb.votoProducer.model.Voto;
import edu.caferreb.votoProducer.services.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/votos")
public class VotoController {
        @Autowired
        private VotoService votoService;


        @PostMapping
        public void create(@RequestBody Voto voto) throws JsonProcessingException {
            votoService.create(voto);
        }
}
