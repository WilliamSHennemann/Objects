package Aula_01062026.Exercicios.Sistema_funcinarios;

public class Empresa {
    static void main() {



        Funcionarios.setEmpresa("Minha Empresa Ltda");

        System.out.println("=== CADASTRO DE FUNCIONÁRIOS ===\n");

        // Funcionário 1
        Funcionarios f1 = new Funcionarios();
        f1.setNome("João Silva");
        f1.setCargo("Desenvolvedor");
        f1.setSalario(5000.00f);
        f1.gerarId();

        // Funcionário 2
        Funcionarios f2 = new Funcionarios();
        f2.setNome("Maria Santos");
        f2.setCargo("Gerente");
        f2.setSalario(8000.00f);
        f2.gerarId();

        // Funcionário 3
        Funcionarios f3 = new Funcionarios();
        f3.setNome("Pedro Costa");
        f3.setCargo("Analista");
        f3.setSalario(4500.00f);
        f3.gerarId();

        // Funcionário 4 - Testando salário negativo
        System.out.println("--- Testando validação de salário ---");
        Funcionarios f4 = new Funcionarios();
        f4.setNome("Carlos Lima");
        f4.setCargo("Estagiário");
        f4.setSalario(-500.00f);
        f4.gerarId();

        // Funcionário 5
        Funcionarios f5 = new Funcionarios();
        f5.setNome("Ana Souza");
        f5.setCargo("Designer");
        f5.setSalario(3800.00f);
        f5.gerarId();

        // Exibindo dados de todos
        System.out.println("\n--- DADOS DOS FUNCIONÁRIOS ---\n");
        f1.exibirDados();
        System.out.println();
        f2.exibirDados();
        System.out.println();
        f3.exibirDados();
        System.out.println();
        f4.exibirDados();
        System.out.println();
        f5.exibirDados();

        // Testando aumentos
        System.out.println("\n--- AUMENTOS SALARIAIS ---\n");
        f1.aumentarSalario(10);  // Aumento de 10%
        System.out.println();
        f2.aumentarSalario(15);  // Aumento de 15%
        System.out.println();
        f3.aumentarSalario(5);   // Aumento de 5%
        System.out.println();

        // Testando percentual inválido
        System.out.println("--- Testando percentual negativo ---");
        f4.aumentarSalario(-10);

        // Mostrando dados após aumentos
        System.out.println("\n--- DADOS APÓS AUMENTOS ---");
        System.out.println("Funcionário: " + f1.getNome() + " - Salário: R$ " + String.format("%.2f", f1.getSalario()));
        System.out.println("Funcionário: " + f2.getNome() + " - Salário: R$ " + String.format("%.2f", f2.getSalario()));
        System.out.println("Funcionário: " + f3.getNome() + " - Salário: R$ " + String.format("%.2f", f3.getSalario()));

        // Estatísticas finais
        System.out.println("\n--- ESTATÍSTICAS FINAIS ---");
        Funcionarios.mostrarTotalFuncionarios();
        System.out.println("Empresa: " + Funcionarios.getEmpresa());
        System.out.println("Próximo ID disponível: " + (Funcionarios.proximoID + 1));
    }

}
