package Exercicio_Conta_Bancaria;
public class Pessoa {

    String nome;
    String eMail;
    int telefone;
    String endereco;

    public Pessoa(String nome, String eMail, int telefone, String endereco) {
        this.nome = nome;
        this.eMail = eMail;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome + " | eMail: " + this.eMail + " | Telefone: " + this.telefone + " | Endereço: " + this.endereco);
    }
}
