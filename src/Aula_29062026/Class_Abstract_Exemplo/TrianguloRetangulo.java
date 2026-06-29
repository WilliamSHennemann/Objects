package Aula_29062026.Class_Abstract_Exemplo;

public class TrianguloRetangulo extends Figura{

    private double base;
    private double altura;


    public TrianguloRetangulo(){
        setNome("TrianguloRetangulo");
    }


    public double getbase() {
        return base;
    }

    public double getaltura() {
        return altura;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (base*altura)/2;
    }

    @Override
    public double calculaPerimetro() {
        double hip = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        return hip+base+altura;
    }


}
