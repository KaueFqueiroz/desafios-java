package desafio02;

public class ItemBiblioteca {

    private String titulo;
    private int anoPublicacao;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, int anoPublicacao, boolean disponivel){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public ItemBiblioteca setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public ItemBiblioteca setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
        return this;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public ItemBiblioteca setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }

    public void exibirInfo(){
        System.out.println("Titulo: "+ getTitulo());
        System.out.println("Ano Publicação: " + getAnoPublicacao());
        System.out.println( "Disponivel: " + getDisponivel());
    }

    public void emprestar(){
        if (getDisponivel()){
            setDisponivel(false);
            System.out.println("Emprestando " + getTitulo() + "...") ;
            System.out.println("Item Emprestado");
            System.out.println();
        }
        else {
            System.out.println("Tentando Emprestar " +getTitulo() + " novamente...");
            System.out.println("Item Indiponivel!");
            System.out.println();
        }
    }

    public void devolver() {
        if (!getDisponivel()) {
            setDisponivel(true);
            System.out.println("Devolvendo " + getTitulo());
            System.out.println("Item Devolvido com Sucesso");
            System.out.println();
        } else {
            System.out.println("Item Disponivel!");
            System.out.println();
        }

    }
}
