package Aula_29062026.Class_Abstract_Exemplo;

public class Circulo extends Figura{

    private double raio;

    public Circulo(){
        setNome("Circulo");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2*Math.PI*raio;
    }
}
