package Exercicio_Conta_Bancaria;

public class Calculadora {
    static void main() {
        Operacoes operacoes = new Operacoes();

        float n1, n2;


        n1 = Float.parseFloat(IO.readln("Digite o primeiro número da soma: "));
        n2 = Float.parseFloat(IO.readln("Digite o segundo número da soma: "));
        System.out.println("Resultado da soma: " + operacoes.soma(n1, n2));


        n1 = Float.parseFloat(IO.readln("Digite o primeiro número da subtração: "));
        n2 = Float.parseFloat(IO.readln("Digite o segundo número da subtração: "));
        System.out.println("Resultado da subtração: " + operacoes.subtracao(n1, n2));

        n1 = Float.parseFloat(IO.readln("Digite o primeiro número da multiplicação: "));
        n2 = Float.parseFloat(IO.readln("Digite o segundo número da multiplicação: "));
        System.out.println("Resultado da multiplicação: " + operacoes.multiplicacao(n1, n2));

        n1 = Float.parseFloat(IO.readln("Digite o primeiro número da divisão: "));
        n2 = Float.parseFloat(IO.readln("Digite o segundo número da divisão: "));
        System.out.println("Resultado da divisão: " + operacoes.divisao(n1, n2));

        n1 = Float.parseFloat(IO.readln("Digite o número para elevar ao quadrado: "));
        System.out.println("Resultado do quadrado: " + operacoes.exponenciacao(n1));

        n1 = Float.parseFloat(IO.readln("Digite o tamanho do lado do quadrada para calcular sua area: "));
        System.out.println("Resultado do quadrado: " + operacoes.area_quadrado(n1));

        double raio = Double.parseDouble(IO.readln("Digite o raio circulo: "));
        System.out.printf("A área do círculo é: %.2f%n", operacoes.calcularCirculo(raio));

    }
}
