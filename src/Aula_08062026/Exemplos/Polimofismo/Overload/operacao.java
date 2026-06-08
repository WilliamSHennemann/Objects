package Aula_08062026.Exemplos.Polimofismo.Overload;

public class operacao {

    //Para ser possivel implementar o Overload é necessario que os
    //tipos ou quantidades de parâmetros sejam diferentes

    public int soma(int n1, int n2){
        return n1 + n2;
    }

    public int soma(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double soma(double[] vetor){
        double soma = 0;
        for (double i : vetor) {
            soma+=i;
        }
        return soma;
    }

    public String soma (String nome, String sobrenome){
        return nome + sobrenome;
    }
}
