package Aula_22062026.Exemploexcessões;

public class Exemplo2 {
    static void main() {
        Tratamentoexcecoes l1 = new Tratamentoexcecoes(10);
        l1.adiciona("A");
        l1.adiciona("B");
        l1.adiciona("C");
        try{

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
