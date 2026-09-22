package weslei894.sistema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDateTime;

@Entity 
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private LocalDateTime data;

    @ManyToOne
    @NotNull
    private Produto produto;

    @Positive
    private int quantidade;

    @ManyToOne
@NotNull
private Cliente cliente;

@NotNull
private StatusPedido status;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   public Cliente getCliente() {
    return cliente;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public StatusPedido getStatus() {
    return status;
}

public void setStatus(StatusPedido status) {
    this.status = status;
}
}
