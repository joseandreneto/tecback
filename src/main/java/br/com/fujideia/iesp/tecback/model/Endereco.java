package br.com.fujideia.iesp.tecback.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue
    private Integer id;
    private String pais;

    private String estado;

    private String cidade;
    private String rua;
    private Integer cep;
}
