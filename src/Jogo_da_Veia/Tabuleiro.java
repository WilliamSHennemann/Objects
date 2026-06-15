package Jogo_da_Veia;

public class Tabuleiro {
    private char[][] grid;
    private int jogadas;

    public Tabuleiro() {
        grid = new char[3][3];
        jogadas = 0;
        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                grid[i][j] = ' ';
    }

    public void exibir() {
        System.out.println("\n  Posições:");
        System.out.println("   1   2   3");
        System.out.println("   4   5   6");
        System.out.println("   7   8   9\n");
        System.out.println("  Tabuleiro atual:");
        for (int i = 0; i < 3; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            if (i < 2) System.out.println("\n  ---------");
        }
        System.out.println();
    }

    public boolean fazerJogada(int posicao, char simbolo) {
        int linha = (posicao - 1) / 3;
        int coluna = (posicao - 1) % 3;
        if (posicao < 1 || posicao > 9) {
            System.out.println("Posição inválida! Use números de 1 a 9.");
            return false;
        }
        if (grid[linha][coluna] != ' ') {
            System.out.println("Posição já ocupada!");
            return false;
        }
        grid[linha][coluna] = simbolo;
        jogadas++;
        return true;
    }

    public boolean fazerJogada(int linha, int coluna, char simbolo) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) return false;
        if (grid[linha][coluna] != ' ') return false;
        grid[linha][coluna] = simbolo;
        jogadas++;
        return true;
    }

    public boolean verificarVitoria(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == simbolo && grid[i][1] == simbolo && grid[i][2] == simbolo) ||
                    (grid[0][i] == simbolo && grid[1][i] == simbolo && grid[2][i] == simbolo))
                return true;
        }
        return (grid[0][0] == simbolo && grid[1][1] == simbolo && grid[2][2] == simbolo) ||
                (grid[0][2] == simbolo && grid[1][1] == simbolo && grid[2][0] == simbolo);
    }

    public boolean verificarEmpate() {
        return jogadas == 9;
    }

    public void reiniciar() {
        inicializar();
        jogadas = 0;
    }

    public char[][] getGrid() {
        char[][] copia = new char[3][3];
        for (int i = 0; i < 3; i++)
            System.arraycopy(grid[i], 0, copia[i], 0, 3);
        return copia;
    }

    public boolean isVazio(int linha, int coluna) {
        return grid[linha][coluna] == ' ';
    }
}
