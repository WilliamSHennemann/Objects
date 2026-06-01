package Aula_01062026.Exercicios.Sistema_simples;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private static int totalAlunos = 0;
    private static int codigoGerado = 1000;

    void gerarMatricula() {
        codigoGerado++;
        this.matricula = codigoGerado;
        totalAlunos++;
    }

    public void setNome (String nome){
        if (nome != null && nome.length() >= 3) {
            this.nome = nome;
        }
    }

    public void setCurso(String curso){
        if (nome != null && nome.length() >= 3) {
            this.curso = curso;
        }
    }

    public String getNome(){
        return nome;
    }

    public String getCurso(){
        return curso;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("---");
    }

    public static void mostrarTotalAlunos() {
        System.out.println("Total de alunos: " + totalAlunos);
    }




}
