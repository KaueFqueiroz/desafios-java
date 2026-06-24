package desafio03;

public class PagamentoBoleto implements Pagamento {
    private String codigoBoleto;
    private String dataVencimento;

    public PagamentoBoleto(String codigoBoleto, String dataVencimento){
        this.codigoBoleto = codigoBoleto;
        this.dataVencimento = dataVencimento;
    }

    public String getCodigoBoleto() {
        return codigoBoleto;
    }

    public PagamentoBoleto setCodigoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
        return this;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public PagamentoBoleto setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via Boleto...");
        System.out.println("Pagamento de R$ " + valor + " aprovado!");
        System.out.println();
    }

    @Override
    public void exibirComprovante() {
        System.out.println("=== Comprovante Boleto ===");
        System.out.println("Código: " + getCodigoBoleto());
        System.out.println("Vencimento: " + getDataVencimento());
        System.out.println();
    }
}
