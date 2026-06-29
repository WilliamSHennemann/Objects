package Aula_29062026.Class_Abstract_Exemplo;

public class Principal {
    static void main() {
        Circulo c1 = new Circulo();
        c1.setRaio(5);
        IO.println("A figura "+c1.getNome()+" tem");
        IO.println("Area %.2f".formatted(c1.calculaArea()));
        IO.println("Perimetro %.2f".formatted(c1.calculaPerimetro()));

        TrianguloRetangulo r1 = new TrianguloRetangulo();
        r1.setaltura(2);
        r1.setbase(3);
        IO.println("A figura "+r1.getNome()+" tem");
        IO.println("A Area de %.2f cm²".formatted(r1.calculaArea()));
        IO.println("O Perimetro de %.2f cm".formatted(r1.calculaPerimetro()));
    }
}
