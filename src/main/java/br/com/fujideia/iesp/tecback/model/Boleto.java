package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_boleto")
public class Boleto {

    @Id
    @GeneratedValue
    private Integer id;

    private String cod_barra;

    private String vencimento;
    private String nomeUsuario;

    @OneToOne
    private Plano plano;
}

