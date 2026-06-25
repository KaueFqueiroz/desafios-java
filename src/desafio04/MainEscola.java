package desafio04;

import java.util.ArrayList;
import java.util.List;

public class MainEscola {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana Silva", 20, "2024001", 8.0, 9.0, 8.5));
        alunos.add(new Aluno("Carlos Souza", 22, "2024002", 5.0, 6.5, 6.5));
        alunos.add(new Aluno("Maria Lima", 21, "2024003", 4.0, 3.5, 5.0));
        alunos.add(new Aluno("Pedro Costa", 23, "2024004", 9.0, 8.5, 10.0));

        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor("João Mendes", 45, "Matemática", 4500.00));
        professores.add(new Professor("Carla Dias", 38, "Português", 4200.00));

        System.out.println("=== ALUNOS ===");
        for (Aluno aluno : alunos) {
            aluno.exibirInfo();
            System.out.println("--------------------------");
        }

        System.out.println("\n=== PROFESSORES ===");
        for (Professor professor : professores) {
            professor.exibirInfo();
            System.out.println("--------------------------");
        }

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (Aluno aluno : alunos) {
            if (aluno.situacao().equals("Aprovado")) {
                aprovados++;
            } else if (aluno.situacao().equals("Recuperação")) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);

        Aluno maior = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() > maior.calcularMedia()) {
                maior = aluno;
            }
        }

        System.out.println("Maior média: " + maior.getNome() +
                " (" + maior.calcularMedia() + ")");
    }
}