package weslei894.sistema.repository;

import weslei894.sistema.model.Cliente;
import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 * ClienteRepository
 */
@ApplicationScoped
public class ClienteRepository implements PanacheRepository<Cliente> {

}
