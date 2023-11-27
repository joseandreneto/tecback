package br.com.fujideia.iesp.tecback.model;

import br.com.fujideia.iesp.tecback.validator.Nome;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;
    @Nome
    @NotBlank(message = "O campo 'nome' não pode estar em branco.")
    private String nome;

    @NotBlank(message = "O campo 'email' não pode estar em branco.")
    @Email(message = "O email deve ser válido.")
    private String email;

    @OneToOne
    private Plano plano;
}