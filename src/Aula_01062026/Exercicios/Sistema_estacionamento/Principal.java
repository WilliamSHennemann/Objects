package Aula_01062026.Exercicios.Sistema_estacionamento;

public class Principal {
    static void main() {
        System.out.println("=== SISTEMA DE ESTACIONAMENTO ===\n");

        Veiculo v1 = new Veiculo();
        v1.registrarEntrada("ABC-1234", "Fiat Uno", 3);
        v1.exibirDados();
        v1.sair();

        System.out.println();

        Veiculo v2 = new Veiculo();
        v2.registrarEntrada("XYZ-5678", "Honda Civic", 5);
        v2.exibirDados();
        v2.sair();

        System.out.println("\nVagas ocupadas no final: ");
        Veiculo.mostrarVagasOcupadas();
    }
}
