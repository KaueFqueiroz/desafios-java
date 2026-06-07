package desafio01;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();

        Produto hamburguer = new Produto("Hamburguer", 20);
        Produto coca = new Produto("Coca-cola", 5);
        Produto batata_frita = new Produto("Batata-Frita", 12);
        Produto agua = new Produto("Água", 2);
        Produto suco = new Produto("Suco", 7);
        Produto pizza = new Produto("Pizza", 25);

        Pedido pedido1 = new Pedido(1, "Gabriel Luiz");
        pedido1.adicioarItem(hamburguer);
        pedido1.adicioarItem(coca);
        pedido1.adicioarItem(batata_frita);

        pedido1.exibirPedido();

        pedidos.add(pedido1);

        Pedido pedido2 = new Pedido(2, "Maria Julia");

        pedido2.adicioarItem(pizza);
        pedido2.adicioarItem(suco);

        pedido2.exibirPedido();

        pedidos.add(pedido2);

        Pedido pedido3 = new Pedido(3, "Kaue");

        pedido3.adicioarItem(agua);

        pedido3.exibirPedido();

        pedidos.add(pedido3);

        Pedido maior = pedidos.get(0);
        for (Pedido pedido : pedidos) {
            if (pedido.calcularTotal() > maior.calcularTotal()) {
                maior = pedido;
            }
        }

        System.out.println("Pedido de maior valor: Pedido #" +
                maior.getNumeroPedido() + " - " +
                maior.getNomeCliente() +
                " (R$ " + maior.calcularTotal() + ")");

    }
}

