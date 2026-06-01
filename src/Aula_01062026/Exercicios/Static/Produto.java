package Aula_01062026.Exercicios.Static;

public class Produto {
    private String nome;
    private double preco;
    private int codigo;
    private static int quantidadeTiposProduto = 0;
    private static int proximoCodigo = 100;

    public void cadastrarProduto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
        quantidadeTiposProduto++;
        proximoCodigo++;
        this.codigo = proximoCodigo;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 2) {
            this.nome = nome;
        } else {
            this.nome = "Produto sem nome";
        }
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço não pode ser negativo!");
            this.preco = 0;
        }
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getCodigo() { return codigo; }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("---");
    }

    public static void mostrarQuantidadeProdutos() {
        System.out.println("Total de produtos cadastrados: " + quantidadeTiposProduto);
    }
}
