package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Boleto;
import br.com.fujideia.iesp.tecback.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boleto")
public class BoletoContolller {
    @Autowired
    private BoletoService service;

    @PostMapping
    public ResponseEntity<Boleto> salvar(@RequestBody Boleto boleto){
        boleto = service.salvar(boleto);
        return ResponseEntity.ok(boleto);
    }
    @PutMapping
    public ResponseEntity<Boleto> alterar(@RequestBody Boleto boleto){
        boleto = service.alterar(boleto);
        return ResponseEntity.ok(boleto);
    }
    @GetMapping
    public ResponseEntity<List<Boleto>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Boleto> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
