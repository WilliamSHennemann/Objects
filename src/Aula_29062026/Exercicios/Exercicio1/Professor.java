package Aula_29062026.Exercicios.Exercicio1;

public class Professor extends Funcionarios{
    private String nome;
    private int horasAula;

    public Professor(double salarioBase, int horasAula) {
        this.horasAula = horasAula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor() {
        setNome("Juarez Soares Jareld");
    }

    @Override
    public double calcularSalario() {
        double salarioBase = getSalarioBase();
        return salarioBase + (horasAula * 50.0);
    }
}
