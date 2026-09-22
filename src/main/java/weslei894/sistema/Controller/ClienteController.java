package weslei894.sistema.Controller;

import jakarta.ws.rs.Path;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import weslei894.sistema.model.Cliente;


@Path("/clientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClienteController {
    
    @Inject 
    private weslei894.sistema.service.ClienteService clienteService;

    @POST 
    public weslei894.sistema.model.Cliente criarCliente(weslei894.sistema.model.Cliente cliente) {
        return clienteService.criarCliente(cliente);
    }

    @GET 
    public java.util.List<weslei894.sistema.model.Cliente> listarTodosClientes() {
        return clienteService.ListarTodosClientes();
    }
}
