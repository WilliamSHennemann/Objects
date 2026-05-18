package Exercicio_Conta_Bancaria;
public class Operacoes {

    float soma;
    float subtracao;
    float multiplicacao;
    float exponenciacao;

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
}
