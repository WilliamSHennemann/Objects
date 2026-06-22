package Aula_22062026.Exemploexcessões;

public class Tratamentoexcecoes {
    private String[] elementos;
    private int tamanho;

    public Tratamentoexcecoes(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public void adiciona(String elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public  String obterElemento(int posicao){
        if (posicao < 0 || posicao >=tamanho)
            throw new IllegalArgumentException("A posição "+posicao+" não é valida");
        return elementos[posicao];
    }

}
