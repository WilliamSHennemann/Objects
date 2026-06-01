package Aula_01062026.Exercicios.Static;

public class Principal {
    static void main() {
        System.out.println("=== SISTEMA DE PRODUTOS ===\n");

        Produto p1 = new Produto();
        p1.cadastrarProduto("Notebook", 2500.00);
        p1.exibirDados();

        Produto p2 = new Produto();
        p2.cadastrarProduto("Mouse", 50.00);
        p2.exibirDados();

        Produto p3 = new Produto();
        p3.cadastrarProduto("Teclado", 120.00);
        p3.exibirDados();

        System.out.println();
        Produto.mostrarQuantidadeProdutos();
    }
}
