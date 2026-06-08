package Aula_08062026.Exemplos.Atributo;

public class operaçoes {
    //Atributos definidos como final não podem ser alterados
    //Eles devem ser inicializados na declaração ou ate o final do construtor
    final double valorPI;

    //O modificador Final esta diretamente ligada a construção de constantes
    //Constantes precisam de acesso global (public)
    //Constantes precisam existir independente da criação de instancias (static)
    //Não podem ter o valor alterado (Final)
    public static final double PI = 3.1487658686585;


    operaçoes(){
        valorPI = 3;
    }



}
