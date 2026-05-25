package Aula_25052026.Acesse_Exe;

public class Cadastro {
    static void main() {
        Pessoa p1 = new Pessoa();
        //Como o nome é publico em Pessoa, ele pode ser acessado em qualque lugar
        p1.nome = "Jonas";
        //Como o sobrenome é protegido em Pessoa, ele não é visivel para classe no mundo
        //p1.sobrebome = "Silva";
        //Atributos sem modificador tambem não podem ser acessados fora do pacote
        //p1.sobrebome = "jonas@terra.com.br";
        //Como o cpf é privado ele só pode ser acessado dentor da propria classe
        //p1.cpf = "000.000.000-00";
        //Como agora o cpf esta encapsulado
        p1.setCpf("000.000.000-00");
        IO.println("O cpf de "+p1.nome+" é "+p1.getCpf());
    }
}
