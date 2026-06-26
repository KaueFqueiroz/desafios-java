package desafio05;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public ContaBancaria setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public String getTitular() {
        return titular;
    }

    public ContaBancaria setTitular(String titular) {
        this.titular = titular;
        return this;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        System.out.println("Tentando sacar: R$ " +valor);
        if (valor <= 0) {
            System.out.println("Não foi possivel realizar saque, valor menor que 0");
            return;
        }
        if (valor > saldo) {
            System.out.println("Não foi possivel realizar saque, valor maior que o saldo atual");
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$ " +valor + " realizado!");
    }

    public void transferir(double valor, ContaBancaria destino) {
        System.out.println("Transferindo R$ " + valor + " para " + destino.getTitular());
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void exibirInfo(){
        System.out.println("==== Extrato ====");
        System.out.println("Conta: " +getNumeroConta());
        System.out.println("Titular: " +getTitular());
        System.out.println("Saldo: " +getSaldo());
        System.out.println();
    }



}
