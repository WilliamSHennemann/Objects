package Aula_08062026.Exemplos.Polimofismo.Overload;

public class Principal {
    static void main() {
        operacao op = new operacao();
        //O java "sabe" qual metodo chamar por causa dos parametros passados
        IO.println(op.soma(5,2));
        IO.println(op.soma(4,6,7));
        IO.println(op.soma("joao", "Silva"));
    }
}
