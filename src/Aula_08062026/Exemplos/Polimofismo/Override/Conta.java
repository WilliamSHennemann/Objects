package Aula_08062026.Exemplos.Polimofismo.Override;

import java.util.Random;

public class Conta {
    private String titular;
    private String id;
    protected double saldo;

    public Conta(String titular){
        this.titular = titular;
        geraId();
        saldo = 0;
    }

    private void geraId(){
        Random aleatorio = new Random();
        id = "";
        for (int i = 0; i < 4; i++) {
            id+=(char) aleatorio.nextInt(1000,9999);
        }
        id+=aleatorio.nextInt(1000,9999);
    }
    public void depositar(double valor){
        if(valor>0){
            saldo+=valor;
        }
    }
    public boolean sacar (double valor){
        if (valor >= saldo && valor>0){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public String verificaSaldo(){
        return "Seu saldo é de R$%.2f".formatted(saldo);
    }

    @Override
    public String toString(){
        return "Id: "+id+"\nTitular: "+titular+"\n"+verificaSaldo();
    }
}
