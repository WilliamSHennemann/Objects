package Aula_25052026.Exemplo_Static;

public class Atributo {

    static double leDouble (String mensagem){
        return Double.parseDouble(IO.readln(mensagem+": "));
    }

    static double soma(double n1, double n2){
        return n1+n2;
    }

    static double exponenciacao(double base, double expoente){
        double mult = 1;
        for (int i = 0; i < expoente; i++) {
            mult*=base;
        }
        return mult;
    }

}
