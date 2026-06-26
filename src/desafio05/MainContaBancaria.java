package desafio05;

public class MainContaBancaria{
public static void main(String[] args) {

    ContaBancaria c1 = new ContaBancaria("000-1", "Kaue", 0);
    ContaBancaria c2 = new ContaBancaria("000-2", "Gabriel", 0);
    ContaBancaria c3 = new ContaBancaria("000-3", "Maria", 0);

    c1.depositar(100);
    c2.depositar(200);
    c3.depositar(50);
    System.out.println();

    c2.sacar(250);
    System.out.println();

    c3.transferir(25,c1);
    System.out.println();

    System.out.println("=== Extrato Final ===");
    c1.exibirInfo();
    c2.exibirInfo();
    c3.exibirInfo();
    }
}