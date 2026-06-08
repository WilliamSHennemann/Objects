package Aula_08062026.Exemplos.Polimofismo.Override;

public class contaCorrente extends Conta{
    private double limite;


    public contaCorrente(String titular, double limiteInicial){
        super(titular);
        limite = limiteInicial;
    }

    @Override
    public boolean sacar (double valor){
        if(saldo+limite >=valor && valor>0){
            saldo-=valor;
            return true;
        }
        return false;
    }

    @Override
    public String verificaSaldo(){
        //String saldo = "Seu saldo é de R$%.2f".formatted(super.saldo);
        String saldo = "Seu saldo é de R$%.2f".formatted(this.saldo);
        if (this.saldo>0){
            saldo+= "\nLimite disponivel R$%.2f".formatted(limite);
        }
        else {
            saldo+= "\nLimite disponivel R$%.2f".formatted(this.saldo+limite);
        }
        return saldo;
    }

}
