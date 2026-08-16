package desafio09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDesafio09 {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse", 50, "Eletronicos"));
        produtos.add(new Produto("Teclado", 80, "Eletronicos"));
        produtos.add(new Produto("Mesa", 400, "Moveis"));
        produtos.add(new Produto("Estante", 550, "Moveis"));
        produtos.add(new Produto("Cadeira", 70, "Moveis"));
        produtos.add(new Produto("Camisa", 100, "Vestiario"));
        produtos.add(new Produto("Calça", 120, "Vestiario"));
        produtos.add(new Produto("Prateleira", 130, "Moveis"));
        produtos.add(new Produto("Tv", 1000, "Eletronicos"));

        // 1. filtrar eletrônicos
        System.out.println("-- Eletrônicos --");
        produtos.stream()
                .filter(produto -> produto.getCategoria().equals("Eletronicos"))
                .forEach(produto -> System.out.println(produto.getNome()));

        // 2. nomes com preço acima de R$100
        System.out.println("-- Acima de R$100 --");
        produtos.stream()
                .filter(produto -> produto.getPreco() > 100)
                .map(produto -> produto.getNome())
                .forEach(System.out::println);

        // 3. soma total

        System.out.println("-- Somar Valor do Estoque Inteiro -- ");

        double somaTotal = produtos.stream()
                .filter(produto -> produto.getPreco() > 0)
                .map(produto -> produto.getPreco())
                .reduce(0.0, (soma, valorAtual) -> soma + valorAtual);

        System.out.println(somaTotal);

        // 4. produto mais caro
        produtos.stream()
                        .max((p1,p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                        .ifPresent(produto -> System.out.println("Mais caro: " + produto.getNome() +" - R$  " + produto.getPreco()));


        System.out.println();
        // 5. ordenar por preço — falta implementar

        System.out.println("Ordem Crescente dos Preços");

        produtos.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .forEach(produto -> System.out.println(produto.getNome() + " - R$ " + produto.getPreco()));


    }
}