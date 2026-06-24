package desafio03;

public class PagamentoCartao implements  Pagamento{
    private String nomeTitular;
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(String nomeTitular, String numeroCartao, int parcelas){
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public PagamentoCartao setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        return this;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public PagamentoCartao setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
        return this;
    }

    public int getParcelas() {
        return parcelas;
    }

    public PagamentoCartao setParcelas(int parcelas) {
        this.parcelas = parcelas;
        return this;
    }

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento no cartão...");
        System.out.println("Pagamento de R$ " + valor + " aprovado!");
        System.out.println("Parcelas: " + getParcelas() + "x de R$ " + (valor / getParcelas()));
        System.out.println();
    }

    @Override
    public void exibirComprovante() {
        System.out.println("=== Comprovante Cartão ===");
        System.out.println("Titular: " + getNomeTitular());
        System.out.println("Cartão: **** **** **** " + getNumeroCartao());
        System.out.println("Parcelas: " + getParcelas());
        System.out.println();
    }
}
