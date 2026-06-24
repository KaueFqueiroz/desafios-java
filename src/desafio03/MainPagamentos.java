package desafio03;

import java.util.ArrayList;
import java.util.List;


public class MainPagamentos {
    public static void main(String[] args) {

            List<Pagamento> pagamentos = new ArrayList<>();
            pagamentos.add(new PagamentoCartao("Kaue", "9999 8888 7777 6666", 2));
            pagamentos.add(new PagamentoPix("9998822334455", "Joãozinho da Esquina" ));
            pagamentos.add(new PagamentoBoleto("123128419981239", "30/06/2026"));

            for (Pagamento pagamento : pagamentos) {
                pagamento.processar(100.0);
                pagamento.exibirComprovante();
            }
    }
}