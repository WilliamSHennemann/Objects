package Aula_29062026.Interface_Exemplo;

public class Principal {
    static void main() {
        Vetor v1 = new Vetor();
        v1.adiciona("A");
        v1.adiciona("B");
        v1.adiciona("C");
        v1.adiciona("D");
        //obterTamanho é um metodo apenas da classe não existe na interface
        IO.println("Qual o tamanho de v1: "+v1.obterTamanho());
        IO.println(v1.obterElementos());
        v1.limpar();
        IO.println(v1.obterElementos());

        /*
        Para criar uma instancia de interface eu devo usar o construtor
        de uma classe que a implementa
        Como resultado na instancia l1 estarão disponiveis apenas as
        metodos comum entre a interface e classe
        seus comportamentos serão "copiados" virtualmente para as instancias
         */
        Lista l1 = new Vetor();
        l1.adiciona("A");
        l1.adiciona("B");
        IO.println(l1.obterElementos());
        /*
        Neste caso o metodo obterTamanho não vai estar disponivel
        ja que ele existe apenas na Classe vetor e não na interface
         */
        //IO.println(l1.obterTamanho());
    }
}
