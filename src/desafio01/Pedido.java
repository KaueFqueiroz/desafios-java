package desafio01;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String nomeCliente;
    private List<Produto> itens;

    public Pedido (int numeroPedido, String nomeCliente){
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.itens = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Pedido setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        return this;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Pedido setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return this;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public Pedido setItens(List<Produto> itens) {
        this.itens = itens;
        return this;
    }

    public void adicioarItem(Produto produto){
        itens.add(produto);
    }

    public double calcularTotal(){
        double sum = 0;

        for(Produto itens :  itens){
            sum += itens.getPreco();
        }

        return sum;
    }

    public void exibirPedido() {
        System.out.println("=============================");
        System.out.println("Pedido #" + numeroPedido + " Cliente: " + nomeCliente);
        System.out.println("=============================");

        for (Produto item : itens){
            System.out.println("- " + item.getNome() + "  R$ " +item.getPreco());
        }

        System.out.println("-----------------------------");
        System.out.println("Total: R$ " + calcularTotal());


    }




}
