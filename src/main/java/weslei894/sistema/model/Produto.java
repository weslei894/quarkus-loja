package weslei894.sistema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue
    public Long id;

    @NotBlank
    public String nome;

    @NotNull
    @Positive
    public BigDecimal preco;

    @NotNull
    public Integer quantidadeEmEstoque;
}