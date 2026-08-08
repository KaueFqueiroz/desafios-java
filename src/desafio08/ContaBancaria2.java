package desafio08;

public class ContaBancaria2 {
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria2(String titular, double saldo, boolean ativa){
        this.titular = titular;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    public void sacar(double valor) {
        System.out.println("Tentando sacar: R$ " +valor);

        if(!ativa){
            throw new ContaInativaException("Conta invalida.");
        }
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor deve ser maior que zero");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: " +saldo);
        }
        saldo -= valor;
        System.out.println("Saque de R$ " +valor + " realizado!");
    }

    public void depositar(double valor) {
        System.out.println("Tentando depositar: R$ "+ valor );

        if (!ativa){
            throw new ContaInativaException("Conta Inativa. ");
        }

        if (valor <= 0 ){
            throw new ValorInvalidoException("Digite um valor maior que zero.");
        }

        saldo += valor;
        System.out.println("Deposito de R$: " + valor + "realziado! Saldo atual: " + saldo);
    }


}
