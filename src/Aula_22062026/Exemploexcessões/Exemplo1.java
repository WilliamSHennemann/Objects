package Aula_22062026.Exemploexcessões;

public class Exemplo1 {
    static void main() {
        try {
         int n1 = Integer.parseInt(IO.readln("Digite um numero: "));
         int n2 = Integer.parseInt(IO.readln("Digite um numero: "));
         int resultado = n1/n2;
         IO.println(resultado);
        }
        catch (NumberFormatException erro){
            IO.println("Os valores de n1 e n2 devem ser numeros");
        }

        catch (ArithmeticException erro){
            IO.println("não é possivel dividir por zero");
        }

        catch (Exception erro){
            IO.println("Algo deu errado ");
        }

    }
}
