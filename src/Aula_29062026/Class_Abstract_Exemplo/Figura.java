package Aula_29062026.Class_Abstract_Exemplo;

public abstract class Figura {
    private String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calculaArea();

    public abstract double calculaPerimetro();


}
