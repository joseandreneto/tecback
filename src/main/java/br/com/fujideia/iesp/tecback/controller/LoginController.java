package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Login;
import br.com.fujideia.iesp.tecback.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping
    public ResponseEntity<Login> salvar(@RequestBody Login login){
        login = service.salvar(login);
        return ResponseEntity.ok(login);
    }
    @PutMapping
    public ResponseEntity<Login> alterar(@RequestBody  Login login){
        login = service.alterar(login);
        return ResponseEntity.ok(login);
    }


}
