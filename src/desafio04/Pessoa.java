package desafio04;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
