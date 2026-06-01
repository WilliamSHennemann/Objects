package Aula_01062026.Exercicios.Sistema_funcinarios;

public class Funcionarios {
    private String nome;
    private String cargo;
    private float salario;
    private int idFuncionario;
    static int proximoID;
    private static String empresa;
    private static int totalFuncionarios = 0;

    public void gerarId() {
        proximoID++;
        this.idFuncionario = proximoID;
        totalFuncionarios++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: Salário não pode ser negativo! Será definido como 0.");
            this.salario = 0;
        }
    }

    public static void setEmpresa(String nomeEmpresa) {
        empresa = nomeEmpresa;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public static String getEmpresa() {
        return empresa;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            float aumento = salario * (float)(percentual / 100);
            salario = salario + aumento;
            System.out.println(nome + " recebeu aumento de " + percentual + "%");
            System.out.println("Novo salário: R$ " + String.format("%.2f", salario));
        } else {
            System.out.println("Percentual inválido!");
        }
    }

    public static void mostrarTotalFuncionarios() {
        System.out.println("Total de funcionários: " + totalFuncionarios);
    }

    public void exibirDados() {
        System.out.println("=== Dados do Funcionário ===");
        System.out.println("ID: " + idFuncionario);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("Empresa: " + empresa);
        System.out.println("============================");
    }
}
