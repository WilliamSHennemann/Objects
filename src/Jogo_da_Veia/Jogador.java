package Jogo_da_Veia;

public class Jogador {
    protected String nome;
    protected char simbolo;
    protected boolean isComputador;

    public Jogador(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.isComputador = false;
    }

    public String getNome() { return nome; }
    public char getSimbolo() { return simbolo; }
    public boolean isComputador() { return isComputador; }

    public int escolherJogada(Tabuleiro tabuleiro) {
        return -1; // humano não usa
    }
}
