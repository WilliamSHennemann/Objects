package Jogo_da_Veia;

public class PC extends Jogador{
    public PC(String nome, char simbolo) {
        super(nome, simbolo);
        this.isComputador = true;
    }

    @Override
    public int escolherJogada(Tabuleiro tabuleiro) {
        char[][] grid = tabuleiro.getGrid();
        char oponente = (simbolo == 'X') ? 'O' : 'X';

        int pos = tentarVencer(grid, simbolo);
        if (pos != -1) return pos;
        pos = tentarVencer(grid, oponente);
        if (pos != -1) return pos;
        if (tabuleiro.isVazio(1, 1)) return 5;
        int[] cantos = {1,3,7,9};
        for (int c : cantos) {
            int l = (c-1)/3, col = (c-1)%3;
            if (tabuleiro.isVazio(l, col)) return c;
        }
        for (int i = 1; i <= 9; i++) {
            int l = (i-1)/3, col = (i-1)%3;
            if (tabuleiro.isVazio(l, col)) return i;
        }
        return -1;
    }

    private int tentarVencer(char[][] grid, char simbolo) {
        for (int i = 1; i <= 9; i++) {
            int l = (i-1)/3, c = (i-1)%3;
            if (grid[l][c] == ' ') {
                grid[l][c] = simbolo;
                boolean venceu = vitoriaSimulada(grid, simbolo);
                grid[l][c] = ' ';
                if (venceu) return i;
            }
        }
        return -1;
    }

    private boolean vitoriaSimulada(char[][] grid, char simbolo) {
        for (int i = 0; i < 3; i++)
            if ((grid[i][0]==simbolo && grid[i][1]==simbolo && grid[i][2]==simbolo) ||
                    (grid[0][i]==simbolo && grid[1][i]==simbolo && grid[2][i]==simbolo))
                return true;
        return (grid[0][0]==simbolo && grid[1][1]==simbolo && grid[2][2]==simbolo) ||
                (grid[0][2]==simbolo && grid[1][1]==simbolo && grid[2][0]==simbolo);
    }
}
