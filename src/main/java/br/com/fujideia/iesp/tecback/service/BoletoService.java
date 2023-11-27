package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Boleto;
import br.com.fujideia.iesp.tecback.repository.BoletoRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BoletoService {
    @Autowired
    private BoletoRepository repository;

    public Boleto salvar(Boleto boleto) {
        boleto = repository.save(boleto);
        return boleto;
    }

    public Boleto alterar(Boleto boleto) {
        if (repository.existsById(boleto.getId())) {
            return repository.save(boleto);
        } else {
            throw new NotFoundException();
        }
    }
    public List<Boleto> listar(){
        return repository.findAll();
    }

    public Boleto consultarPorId(Integer id){
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