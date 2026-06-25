package desafio04;

public class Aluno extends Pessoa implements Avaliavel{
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno (String nome, int idade, String matricula, double nota1, double nota2, double nota3){
        super(nome, idade);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getMatricula() {
        return matricula;
    }

    public Aluno setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public double getNota1() {
        return nota1;
    }

    public Aluno setNota1(double nota1) {
        this.nota1 = nota1;
        return this;
    }

    public double getNota2() {
        return nota2;
    }

    public Aluno setNota2(double nota2) {
        this.nota2 = nota2;
        return this;
    }

    public double getNota3() {
        return nota3;
    }

    public Aluno setNota3(double nota3) {
        this.nota3 = nota3;
        return this;
    }

    public String getNome(){
        return nome;
    }

    public Aluno setNome(String nome){
        this.nome = nome;
        return this;
    }

    public int getIdade(){
        return idade;
    }



    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Matricula: " +matricula);
        System.out.println("Media: " +calcularMedia());
    }

    public String situacao(){
        if (calcularMedia() >= 7){
           return  "Aprovado";
        } else if (calcularMedia() >= 5) {
            return "Recuperação";
        }
        else {
            return "Reprovado";
        }
    }

}
