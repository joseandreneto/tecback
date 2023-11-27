package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_login")
public class Login {
    @Id
    @GeneratedValue
    private Integer id;

    private String email;

    private String senha;


    @OneToOne
    private Usuario usuario;
}
