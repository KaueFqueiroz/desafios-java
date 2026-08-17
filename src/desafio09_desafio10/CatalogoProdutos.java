package desafio09_desafio10;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

public class CatalogoProdutos {

    private List<Produto> produtos;

    // recebe a lista no construtor
    public CatalogoProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Optional<Produto> buscarPorNome(String nome) {
        return produtos.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst();
    }

    public Optional<Produto> buscarMaisBarato(String categoria){
        return produtos.stream()
                .filter(produto -> produto.getCategoria().equals(categoria))
                .min((p1,p2 ) -> Double.compare(p1.getPreco(), p2.getPreco()));
    }
}
