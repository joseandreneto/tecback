package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public Cartao salvar(Cartao cartao) {

        return cartaoRepository.save(cartao);
    }

    public Cartao alterar(Cartao cartao) throws NotFoundException {
        if (cartaoRepository.existsById(cartao.getId())) {
            return cartaoRepository.save(cartao);
        }
        else {
            throw new NotFoundException("Cartão com ID " + cartao.getId() + " não encontrado.");
        }
    }
}

