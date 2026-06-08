package desafio02;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Clean code", 2008, true, "Robert C. Martin");
        Livro l2 = new Livro("Hábitos Atômicos",2019, true, "James Clear" );
        Revista r1 = new Revista("Java Magazine", 2023, true,42);
        Revista r2 = new Revista("The Boys", 2025, true, 3);

        l1.exibirInfo();
        r1.exibirInfo();
        l2.exibirInfo();
        r2.exibirInfo();

        l1.emprestar();
        l1.emprestar();

        l1.devolver();

        l1.emprestar();

    }
}
