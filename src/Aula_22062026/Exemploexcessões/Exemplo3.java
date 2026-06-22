package Aula_22062026.Exemploexcessões;

public class Exemplo3 {

    public static int leNumero(String mensagem){
        try {
            int numero = Integer.parseInt(IO.readln(mensagem+": "));
            return numero;
        }
        catch (NumberFormatException e){
            leNumero(mensagem);
        }
        return 0;
    }


    /*public static int leNumero(String mensagem){
        boolean erro;
        int numero = 0;
        do {
            try {
                numero = Integer.parseInt(IO.readln(mensagem+": "));
                erro = false;
            }
            catch (NumberFormatException e){
                IO.println("Precisa digitar um numero, tente novamente");
                erro = true;
            }
        }
        while (erro);
        return numero;
        
    }*/

    static void main() {
      int n1 = leNumero(IO.readln("Numero: "));
    }
}
