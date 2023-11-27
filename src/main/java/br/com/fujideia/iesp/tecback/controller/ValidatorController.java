package br.com.fujideia.iesp.tecback.controller;


import br.com.fujideia.iesp.tecback.exception.CustomException;
import br.com.fujideia.iesp.tecback.model.dto.NomeDTO;
import br.com.fujideia.iesp.tecback.model.dto.ValidatorDTO;
import br.com.fujideia.iesp.tecback.validator.Nome;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/valida")
public class ValidatorController {


    @PostMapping
    public ValidatorDTO validarBean(@Valid ValidatorDTO validatorDTO){

        return validatorDTO;
    }


    @GetMapping
    public ValidatorDTO custonException(@Valid ValidatorDTO validatorDTO){

        if (validatorDTO.getNome().equalsIgnoreCase("fujioka")) {
            throw new CustomException("Algo deu errado. Fujiokas não são permitidos");
        }
        return validatorDTO;
    }


    @GetMapping("/null")
    public ValidatorDTO nullException(@Valid ValidatorDTO validatorDTO){

        validatorDTO = null;
        validatorDTO.getIdade();

        return validatorDTO;
    }

    @GetMapping("/nome")
    public NomeDTO nullException(@Valid NomeDTO nomeDTO){
        nomeDTO = null;
        nomeDTO.getNome();

        return nomeDTO;
    }
}