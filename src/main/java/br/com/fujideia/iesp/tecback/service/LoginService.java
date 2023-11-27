package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Login;
import br.com.fujideia.iesp.tecback.repository.LoginRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Login> listar(){
        return repository.findAll();
    }

    public Login consultarPorId(Integer id){
        return repository.findById(id).get();
    }

    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }



}

