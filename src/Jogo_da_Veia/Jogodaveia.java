package Jogo_da_Veia;

import java.util.Random;

public class Jogodaveia {
    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;
    private Random random;
    private boolean modoComputador;

    public Jogodaveia() {
        tabuleiro = new Tabuleiro();
        random = new Random();
    }

    public void iniciar() {
        System.out.println("===== JOGO DA VELHA =====");
        configurarModo();
        configurarJogadores();

        boolean jogarNovamente;
        do {
            tabuleiro.reiniciar();
            sortearPrimeiroJogador();
            boolean jogoAtivo = true;
            while (jogoAtivo) {
                tabuleiro.exibir();
                realizarTurno();
                if (verificarFimDeJogo()) {
                    jogoAtivo = false;
                } else {
                    alternarJogador();
                }
            }
            String resposta = IO.readln("Deseja jogar novamente? (s/n): ");
            jogarNovamente = resposta.equalsIgnoreCase("s");
        } while (jogarNovamente);

        System.out.println("Obrigado por jogar!");
    }

    private void configurarModo() {
        System.out.println("Escolha o modo de jogo:");
        System.out.println("1 - Jogar contra outra pessoa");
        System.out.println("2 - Jogar contra o computador");
        int opcao;
        do {
            opcao = Integer.parseInt(IO.readln("Opção: "));
        } while (opcao != 1 && opcao != 2);
        modoComputador = (opcao == 2);
    }

    private void configurarJogadores() {
        String nome1 = IO.readln("Nome do Jogador 1: ");
        char simbolo1 = escolherSimbolo(1);
        jogador1 = new Jogador(nome1, simbolo1);

        char simbolo2 = (simbolo1 == 'X') ? 'O' : 'X';
        if (modoComputador) {
            String nomeComp = IO.readln("Nome do Computador: ");
            jogador2 = new PC(nomeComp, simbolo2);
            System.out.println("Computador jogará com '" + simbolo2 + "'");
        } else {
            String nome2 = IO.readln("Nome do Jogador 2: ");
            jogador2 = new Jogador(nome2, simbolo2);
        }
    }

    private char escolherSimbolo(int jogadorNum) {
        String entrada;
        do {
            entrada = IO.readln("Jogador " + jogadorNum + ", escolha X ou O: ").toUpperCase();
        } while (!entrada.equals("X") && !entrada.equals("O"));
        return entrada.charAt(0);
    }

    private void sortearPrimeiroJogador() {
        int sorteio = random.nextInt(2);
        jogadorAtual = (sorteio == 0) ? jogador1 : jogador2;
        System.out.println("\n" + jogadorAtual.getNome() + " começa jogando!");
        if (jogadorAtual.isComputador())
            System.out.println("(O computador iniciará)");
    }

    private void realizarTurno() {
        System.out.println("\n" + jogadorAtual.getNome() + " (" + jogadorAtual.getSimbolo() + "), é sua vez!");
        if (jogadorAtual.isComputador()) {
            PC comp = (PC) jogadorAtual;
            int posicao = comp.escolherJogada(tabuleiro);
            System.out.println("Computador escolheu posição: " + posicao);
            tabuleiro.fazerJogada(posicao, jogadorAtual.getSimbolo());
        } else {
            int posicao;
            while (true) {
                posicao = Integer.parseInt(IO.readln("Escolha uma posição (1-9): "));
                if (tabuleiro.fazerJogada(posicao, jogadorAtual.getSimbolo()))
                    break;
            }
        }
    }

    private boolean verificarFimDeJogo() {
        if (tabuleiro.verificarVitoria(jogadorAtual.getSimbolo())) {
            tabuleiro.exibir();
            System.out.println("Parabéns " + jogadorAtual.getNome() + "! Você venceu!");
            return true;
        }
        if (tabuleiro.verificarEmpate()) {
            tabuleiro.exibir();
            System.out.println("Empate! O tabuleiro ficou completo.");
            return true;
        }
        return false;
    }

    private void alternarJogador() {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
    }
}
