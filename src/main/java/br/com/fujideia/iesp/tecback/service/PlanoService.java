package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Plano;
import br.com.fujideia.iesp.tecback.repository.PlanoRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlanoService {
    @Autowired
    private PlanoRepository repository;

    public Plano salvar (Plano plano){
        plano= repository.save(plano);
        return plano;
    }
    public Plano alterar(Plano plano) {
        if (repository.existsById(plano.getId())) {
            return repository.save(plano);
        }
        else{
            throw new NotFoundException();
        }
    }
    public List<Plano> listar(){
        return repository.findAll();
    }

    public Plano consultarPorId(Integer id){
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