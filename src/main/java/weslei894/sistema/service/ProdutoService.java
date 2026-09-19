package weslei894.sistema.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import weslei894.sistema.model.Produto;
import weslei894.sistema.repository.ProdutoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ProdutoService {
    
      @Inject
    ProdutoRepository produtoRepository;

    @Transactional
    public Produto cadastrar(Produto produto) {
        produtoRepository.persist(produto);
        return produto;
    }

    public List<Produto> listarTodos() {
    return produtoRepository.listAll();
}

public Produto buscarPorId(Long id) {
    return produtoRepository.findById(id);
}

@Transactional
public Produto atualizar(Long id, Produto produtoAtualizado) {
    Produto produto = produtoRepository.findById(id);

    produto.nome = produtoAtualizado.nome;
    produto.preco = produtoAtualizado.preco;
    produto.quantidadeEmEstoque = produtoAtualizado.quantidadeEmEstoque;

    return produto;
}

@Transactional 
public void deletar(Long id) {
    Produto produto = produtoRepository.findById(id);
    if (produto != null) {
        produtoRepository.delete(produto);
    }
}
}
