package weslei894.sistema.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import weslei894.sistema.model.Cliente;
import weslei894.sistema.repository.ClienteRepository;

@ApplicationScoped
public class ClienteService {
    @Inject
    ClienteRepository clienteRepository;

    @Transactional 
    public Cliente criarCliente(Cliente cliente) {
        clienteRepository.persist(cliente);
        return cliente;
    }
    

    public List<Cliente> ListarTodosClientes() {
        return clienteRepository.listAll();
    }
}
