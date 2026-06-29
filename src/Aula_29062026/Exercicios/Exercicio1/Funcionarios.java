package Aula_29062026.Exercicios.Exercicio1;

public abstract class Funcionarios {
    private String nome;
    private double salarioBase;

    public String getNome(){
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
