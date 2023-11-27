package br.com.fujideia.iesp.tecback.model.dto;

import br.com.fujideia.iesp.tecback.validator.Nome;
import lombok.Data;

@Data

public class NomeDTO {
    @Nome
    private String Nome;
}
