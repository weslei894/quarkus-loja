package weslei894.sistema.Controller;

import weslei894.sistema.model.Produto;
import weslei894.sistema.service.ProdutoService;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoController {

    @Inject
    ProdutoService produtoService;

    @POST
    public Response criar(Produto produto) {
        Produto salvo = produtoService.cadastrar(produto);
        return Response.status(Response.Status.CREATED).entity(salvo).build();
    }

    @GET
    public Response listarTodos() {
        List<Produto> produtos = produtoService.listarTodos();
        return Response.ok(produtos).build();
    }

    @GET
@Path("/{id}")
public Produto buscarPorId(@PathParam("id") Long id) {
    return produtoService.buscarPorId(id);
}

    @PUT
    @Path("/{id}")
    public Produto atualizar(@PathParam("id") Long id, Produto produtoAtualizado) {
        return produtoService.atualizar(id, produtoAtualizado);
    }

    @DELETE
@Path("/{id}")
public Response deletar(@PathParam("id") Long id) {
    produtoService.deletar(id);
    return Response.noContent().build();
}

}
