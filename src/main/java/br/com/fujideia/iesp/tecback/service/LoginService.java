package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Login;
import br.com.fujideia.iesp.tecback.repository.LoginRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class LoginService {
    @Autowired
    private LoginRepository repository;

    public Login salvar (Login login){
        login= repository.save(login);
        return login;
    }
    public Login alterar(Login login) {
        if (repository.existsById(login.getId())) {
            return repository.save(login);
        }
        else{
            throw new NotFoundException();
        }
    }



}

