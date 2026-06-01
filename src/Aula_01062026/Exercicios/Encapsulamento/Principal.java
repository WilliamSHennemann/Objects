package Aula_01062026.Exercicios.Encapsulamento;

public class Principal {
    static void main() {
        System.out.println("=== SISTEMA DE ALUNOS ===\n");

        Aluno a1 = new Aluno();
        a1.cadastrarAluno("João Silva", 8.5, 9.0);
        a1.exibirDados();

        Aluno a2 = new Aluno();
        a2.cadastrarAluno("Maria Santos", 7.0, 6.5);
        a2.exibirDados();

        Aluno a3 = new Aluno();
        a3.cadastrarAluno("Ana", 11.0, -2.0);
        a3.exibirDados();

        System.out.println();
        Aluno.mostrarTotalAlunos();
    }
}
