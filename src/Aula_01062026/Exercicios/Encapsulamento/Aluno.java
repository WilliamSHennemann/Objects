package Aula_01062026.Exercicios.Encapsulamento;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private static int totalAlunos = 0;
    private static int proximaMatricula = 2000;

    public void cadastrarAluno(String nome, double nota1, double nota2) {
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
        totalAlunos++;
        proximaMatricula++;
        this.matricula = proximaMatricula;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 3) {
            this.nome = nome;
        } else {
            System.out.println("Erro: Nome deve ter pelo menos 3 caracteres!");
            this.nome = "Aluno sem nome";
        }
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Erro: Nota1 deve estar entre 0 e 10! Valor não alterado.");
        }
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Erro: Nota2 deve estar entre 0 e 10! Valor não alterado.");
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }

    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
        System.out.println("Média: " + String.format("%.2f", calcularMedia()));
        System.out.println("---");
    }

    public static void mostrarTotalAlunos() {
        System.out.println("Total de alunos cadastrados: " + totalAlunos);
    }
}
