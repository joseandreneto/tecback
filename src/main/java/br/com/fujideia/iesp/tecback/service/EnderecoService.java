package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Endereco;
import br.com.fujideia.iesp.tecback.repository.EnderecoRepository;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
}
