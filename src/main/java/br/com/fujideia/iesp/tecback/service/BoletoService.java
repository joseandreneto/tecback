package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Boleto;
import br.com.fujideia.iesp.tecback.repository.BoletoRepository;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
}