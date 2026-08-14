package desafio08;

public class MainContaBancaria2 {
    public static void main(String[] args) {

        ContaBancaria2 c1 = new ContaBancaria2("Zezinho", 2000, true);
        ContaBancaria2 c2 = new ContaBancaria2("Maria", 500, false);
        ContaBancaria2 c3 = new ContaBancaria2("Michel", 0, false);

        realizarSaque(c1, 2200);   // saldo insuficiente
        realizarDeposito(c2, 500); // conta inativa
        realizarSaque(c3, 100);    // conta inativa
        realizarDeposito(c1, 100); // válido
    }

    static void realizarSaque(ContaBancaria2 conta, double valor) {
        try {
            conta.sacar(valor);
        } catch (SaldoInsuficienteException | ContaInativaException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        }
    }

    static void realizarDeposito(ContaBancaria2 conta, double valor) {
        try {
            conta.depositar(valor);
        } catch (ContaInativaException | ValorInvalidoException e) {
            System.out.println("Erro no depósito: " + e.getMessage());
        }
    }

    static void somarPrecos(){

    }
}