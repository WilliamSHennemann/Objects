package Exercicio_Conta_Bancaria;

public class ContaCorrente {
    int numero;
    String titular;
    double saldo;
    double limite;

    public ContaCorrente(int numero, String titular, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CONTA CORRENTE | Número: " + numero +
                " | Titular: " + titular +
                " | Saldo: R$ " + String.format("%.2f", saldo) +
                " | Limite: R$ " + String.format("%.2f", limite);
    }
}