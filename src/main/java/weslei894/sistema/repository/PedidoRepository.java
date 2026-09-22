package weslei894.sistema.repository;

import weslei894.sistema.model.Pedido;
import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped 
public class PedidoRepository implements PanacheRepository<Pedido> {
    
}
