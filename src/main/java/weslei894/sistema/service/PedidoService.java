package weslei894.sistema.service;

import weslei894.sistema.model.Pedido;
import weslei894.sistema.model.Produto;
import weslei894.sistema.model.Cliente;
import weslei894.sistema.model.StatusPedido;
import weslei894.sistema.repository.ClienteRepository;
import weslei894.sistema.repository.PedidoRepository;
import weslei894.sistema.repository.ProdutoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;

@ApplicationScoped 
public class PedidoService {
    
    @Inject 
    PedidoRepository pedidoRepository;

    @Inject 
    ProdutoRepository produtoRepository;

    @Inject 
    ClienteRepository clienteRepository;

    @Transactional 
    public Pedido criarPedido(Long produtoId, int quantidade, Long clienteId) {
        Produto produto = produtoRepository.findById(produtoId);
        Cliente cliente = clienteRepository.findById(clienteId);

        if (produto == null || cliente == null) {
            throw new IllegalArgumentException("Produto ou Cliente não encontrado.");
        }
        
         if (produto.quantidadeEmEstoque < quantidade) {
           throw new IllegalArgumentException("Quantidade em estoque insuficiente.");
     }


        produto.quantidadeEmEstoque -= quantidade;
        

        Pedido pedido = new Pedido();
        pedido.setProduto(produto);
        pedido.setQuantidade(quantidade);
        pedido.setData(LocalDateTime.now());
        pedido.setStatus(StatusPedido.PENDENTE);
        pedido.setCliente(cliente);

        pedidoRepository.persist(pedido);
        return pedido;
    }
}
