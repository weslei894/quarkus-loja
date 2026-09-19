package weslei894.sistema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Cliente {

    @Id
    @GeneratedValue
    public Long id;

    @NotBlank
    public String nome;

    @NotBlank
    @Email
    public String email;

    @NotBlank
    public String telefone;
}