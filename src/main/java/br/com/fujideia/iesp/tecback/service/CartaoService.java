package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
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
    public List<Cartao> listar(){

        return cartaoRepository.findAll();
    }
    public Cartao consultarPorId(Integer id){
        return cartaoRepository.findById(id).get();
    }


    public Boolean excluir(Integer id){
        try {
            cartaoRepository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }
}