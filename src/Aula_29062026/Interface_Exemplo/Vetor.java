package Aula_29062026.Interface_Exemplo;

public class Vetor implements Lista{

    private String[] elementos;
    private int tamanho;

    public Vetor(){
        elementos = new String[10];
        tamanho = 0;
    }


    @Override
    public void adiciona(String elemento) {
    elementos[tamanho] = elemento;
    tamanho++;
    }

    @Override
    public void remove() {
    tamanho--;
    }

    public int obterTamanho(){
        return tamanho;
    }

    public void limpar(){
        tamanho = 0;
    }


    @Override
    public String obterElementos() {
        if (tamanho>0){
            String dados = "[";
            for (int i = 0; i < tamanho; i++) {
                dados+= elementos[i]+" ";
            }
            return dados+"]";
        }
        return "[]";
    }
}
