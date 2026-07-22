package desafio06;

import java.util.ArrayList;

public class MainEstoque {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.adicionarProduto("Scrub Évoa", 7);
        estoque.adicionarProduto("Scrub Smart Masculino", 10);
        estoque.adicionarProduto("Srucb Basic", 5);
        estoque.adicionarProduto("Jaleco Smith", 1);
        estoque.adicionarProduto("Macacão Cherry", 3);

        estoque.listarTodos();
        System.out.println();

        System.out.println("Quantidade: ");
        estoque.consultarQuantidade("Scrub Smart Masculino");

        System.out.println();

        System.out.println("Produtos com o estoque baixo");
        ArrayList<String> baixo = estoque.produtosComEstoqueBaixo(4);
        System.out.println("Estoque baixo: " + baixo);

        System.out.println();


        System.out.println("Removendo Produto - Ajuste de Estoque");
        estoque.removerProduto("Jaleco Smith");
        System.out.println();
        System.out.println("Após remover Jaleco Smith:");
        estoque.listarTodos();
    }
}