package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_cartao")
public class Cartao {
    @Id
    @GeneratedValue
    private Integer id;
    private String nomeCartao;
    private Integer numcartao;
    private Integer valiCartao;
    @ManyToOne
    private Plano plano;
}
