package desafio03;

public class PagamentoPix implements  Pagamento{
    private String chavePix;
    private String nomeTitular;

    public PagamentoPix(String chavePix, String nomeTitular){
        this.chavePix = chavePix;
        this.nomeTitular = nomeTitular;
    }

    public String getChavePix() {
        return chavePix;
    }

    public PagamentoPix setChavePix(String chavePix) {
        this.chavePix = chavePix;
        return this;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public PagamentoPix setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        return this;
    }

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via Pix...");
        System.out.println("Pagamento de R$ " + valor + " aprovado!");
        System.out.println();
    }

    @Override
    public void exibirComprovante() {
        System.out.println("=== Comprovante Pix ===");
        System.out.println("Titular: " + getNomeTitular());
        System.out.println("Chave Pix: " + getChavePix());
        System.out.println();
    }
}
