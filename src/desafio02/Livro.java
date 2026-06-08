package desafio02;

public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String titulo, int anoPublicacao, boolean disponivel, String autor){
        super(titulo, anoPublicacao, disponivel);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public Livro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + getAutor());
        System.out.println();
    }
}
