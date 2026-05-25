package Aula_25052026.Acesse_Exe;

public class Principal {
    static void main() {
        Pessoa p1 = new Pessoa();
        //Agora como A classe Principal em relação a Pessoa é de pacote
        //ou seja elas estão na mesma pasta
        //posso acessar os atributos public, protected e sem modificador
        p1.nome = "Jonas";
        p1.sobrenome = "Silva";
        p1.email = "jonas@gmail.com";


    }
}
