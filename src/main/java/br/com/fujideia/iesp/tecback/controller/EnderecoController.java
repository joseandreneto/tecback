package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Endereco;
import br.com.fujideia.iesp.tecback.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService service;

    @PostMapping
    public ResponseEntity<Endereco> salvar(@RequestBody Endereco endereco){
        endereco = service.salvar(endereco);
        return ResponseEntity.ok(endereco);
    }
    @PutMapping
    public ResponseEntity<Endereco> alterar(@RequestBody Endereco endereco){
        endereco = service.alterar(endereco);
        return ResponseEntity.ok(endereco);
    }
}