package Aula_01062026.Exercicios.Sistema_simples;

public class Principal {
    static void main() {

        Aluno a1 = new Aluno();
        a1.setNome("João");
        a1.setCurso("Python");
        a1.gerarMatricula();

        Aluno a2 = new Aluno();
        a2.setNome("Maria");
        a2.setCurso("Java");
        a2.gerarMatricula();

        Aluno a3 = new Aluno();
        a3.setNome("");
        a3.setCurso("PHP");
        a3.gerarMatricula();

        a1.exibirDados();
        a2.exibirDados();
        a3.exibirDados();

        Aluno.mostrarTotalAlunos();
    }

}
