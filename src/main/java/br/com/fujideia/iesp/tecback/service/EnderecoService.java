package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Endereco;
import br.com.fujideia.iesp.tecback.repository.EnderecoRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    public Endereco salvar(Endereco endereco) {
        endereco = repository.save(endereco);
        return endereco;
    }

    public Endereco alterar(Endereco endereco) {
        if (repository.existsById(endereco.getId())) {
            return repository.save(endereco);
        }
        else{
            throw new NotFoundException();
        }

    }
    public List<Endereco> listar(){
        return repository.findAll();
    }

    public Endereco consultarPorId(Integer id){
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
