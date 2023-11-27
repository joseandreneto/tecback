package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_plano")
public class Plano {
    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message = "O campo 'nome' não pode estar em branco.")
    private String nome;

    @NotNull(message = "O campo 'valor' não pode ser nulo.")
    @Positive(message = "O valor deve ser um número positivo.")
    private Double valor;

}
