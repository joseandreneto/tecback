package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Genero {
    @Id
    private Integer id;
    private String nome;
}