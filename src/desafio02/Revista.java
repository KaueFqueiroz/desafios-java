package desafio02;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, boolean disponivel, int edicao){
        super(titulo, anoPublicacao, disponivel);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public Revista setEdicao(int edicao) {
        this.edicao = edicao;
        return this;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Edição: " +getEdicao());
        System.out.println();
    }
}
