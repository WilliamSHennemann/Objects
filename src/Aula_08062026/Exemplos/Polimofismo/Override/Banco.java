package Aula_08062026.Exemplos.Polimofismo.Override;

public class Banco {
    static void main() {
        Conta c1 = new Conta("Jonas");
        c1.depositar(100);
        IO.println(c1);
        c1.sacar(100);

        contaCorrente cc1 = new contaCorrente("Ana",100);
        cc1.depositar(100);
        IO.println(cc1);
        cc1.sacar(100);
    }
}
