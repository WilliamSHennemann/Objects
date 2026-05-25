package Aula_25052026.Exemplo_Static;



public class Exemplo {
    static void main() {
        //Como os metodos para operações são staticos posso usar eles sem criar uma instancia da classe
        double n1 = Atributo.leDouble("Valor para n1");
        double n2 = Atributo.leDouble("Valor para n2");
        double soma = Atributo.soma(n1,n2);
        IO.println("%.2f + %.2f = %.2f".formatted(n1,n2,soma));
        double resultado = Atributo.exponenciacao(n1, n2);
        IO.println("%.2f ^ %.2f = %.2f".formatted(n1,n2,resultado));
    }
}
