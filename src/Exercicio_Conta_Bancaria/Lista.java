package Exercicio_Conta_Bancaria;

public class Lista {
    static void main() {
        int tamanhoMaximo = 10;
        Pessoa[] vetorPessoas = new Pessoa[tamanhoMaximo];

        int contador = 0;
        String continuar = "S";
        String nome, eMail, endereco;
        int telefone;

        while (continuar.equalsIgnoreCase("S") && contador < tamanhoMaximo) {

            nome = IO.readln("Digite o nome da pessoa: ");
            eMail = IO.readln("Digite o eMail da pessoa: ");
            telefone = Integer.parseInt(IO.readln("Digite o telefone da pessoa: "));
            endereco = IO.readln("Digite o endereço da pessoa: ");

            vetorPessoas[contador] = new Pessoa(nome, eMail, telefone, endereco);
            contador++;

            if (contador < tamanhoMaximo) {
                continuar = IO.readln("Deseja cadastrar outra pessoa? (S/N): ");

            } else {
                System.out.println("Limite máximo do vetor atingido!");
            }
        }

        System.out.println("\n--- Lista de Pessoas Cadastradas ---");
        for (int i = 0; i < contador; i++) {
            vetorPessoas[i].exibirDados();
        }

    }
}
