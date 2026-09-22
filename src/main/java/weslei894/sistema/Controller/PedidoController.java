package weslei894.sistema.Controller;

import weslei894.sistema.model.Pedido;
import weslei894.sistema.service.PedidoService;
import weslei894.sistema.dto.PedidoRequest;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pedidos")
@Consumes (MediaType.APPLICATION_JSON)
@Produces (MediaType.APPLICATION_JSON)
public class PedidoController {
    
    @Inject 
    PedidoService pedidoService;

    @POST 
    public Response criar(PedidoRequest pedidoRequest) {
        Pedido pedido = pedidoService.criarPedido(pedidoRequest.produtoId, pedidoRequest.quantidade, pedidoRequest.clienteId);
        return Response.status(Response.Status.CREATED).entity(pedido).build();
    }
}
