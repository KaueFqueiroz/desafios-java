package desafio07;

public class MainPilha {
    public static void main(String[] args) {

        Pilha<String> pilhaTexto = new Pilha<>();
        pilhaTexto.push("Kaue");
        pilhaTexto.push("Gabriel");
        pilhaTexto.push("João");

        System.out.println("-- Pilha de nomes --");
        pilhaTexto.exibir();
        System.out.println("Topo: " + pilhaTexto.peek());
        System.out.println("Removendo: " + pilhaTexto.pop());
        pilhaTexto.exibir();

        Pilha<Integer> pilhaNumeros = new Pilha<>();
        pilhaNumeros.push(10);
        pilhaNumeros.push(54);
        pilhaNumeros.push(99);

        System.out.println("-- Pilha de números --");
        pilhaNumeros.exibir();
        System.out.println("Topo: " + pilhaNumeros.peek());
        System.out.println("Removendo: " + pilhaNumeros.pop());
        pilhaNumeros.exibir();
    }
}