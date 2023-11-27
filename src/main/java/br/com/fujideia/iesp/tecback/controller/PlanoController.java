package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Plano;
import br.com.fujideia.iesp.tecback.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plano")
public class PlanoController {
    @Autowired
    private PlanoService service;

    @PostMapping
    public ResponseEntity<Plano> salvar(@RequestBody Plano plano){
        plano = service.salvar(plano);
        return ResponseEntity.ok(plano);
    }
    @PutMapping
    public ResponseEntity<Plano> alterar(@RequestBody  Plano plano){
        plano = service.alterar(plano);
        return ResponseEntity.ok(plano);
    }
}
