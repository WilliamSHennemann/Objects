package Exercicio_Conta_Bancaria;
public class Operacoes {

    private double raio;

    float soma (float n1, float n2){
        return n1 + n2;
    }
    float subtracao (float n1, float n2){
        return n1 - n2;  }
    float multiplicacao (float n1, float n2){
        return n1 * n2;  }
    float divisao (float n1, float n2){
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }  }
    float exponenciacao (float n1){
        return n1 * n1;  }

    float area_quadrado(float n1){
        return n1 * n1;
    }

    double circulo(double raio) {
        this.raio = raio;
        return raio;
    }

    public double calcularCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
