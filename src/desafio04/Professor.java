package desafio04;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String disciplina, double salario){
        super(nome,idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Professor setDisciplina(String disciplina) {
        this.disciplina = disciplina;
        return this;
    }

    public double getSalario() {
        return salario;
    }

    public Professor setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    public Professor setNome(String nome){
        this.nome = nome;
        return this;
    }

    public int getIdade(){
        return idade;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Discplina: " +getDisciplina());
        System.out.println("Salário: " +getSalario());
    }
}
