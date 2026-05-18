package Exercicio_Conta_Bancaria;

public class Banco {
    ContaCorrente[] contasCorrentes;
    ContaPoupanca[] contasPoupancas;
    int qtdCorrente;
    int qtdPoupanca;
    int proximoNumero;

    public Banco() {
        contasCorrentes = new ContaCorrente[100];
        contasPoupancas = new ContaPoupanca[100];
        qtdCorrente = 0;
        qtdPoupanca = 0;
        proximoNumero = 1001;
    }

    public void criarContaCorrente(String titular, double limite) {
        if (qtdCorrente < contasCorrentes.length) {
            ContaCorrente conta = new ContaCorrente(proximoNumero++, titular, limite);
            contasCorrentes[qtdCorrente] = conta;
            qtdCorrente++;
            System.out.println("\nConta Corrente criada com sucesso!");
            System.out.println("Número da conta: " + conta.getNumero());
        } else {
            System.out.println("Limite de contas correntes atingido!");
        }
    }

    public void criarContaPoupanca(String titular, double depositoInicial) {
        if (depositoInicial <= 0) {
            System.out.println("Depósito inicial deve ser positivo!");
            return;
        }

        if (qtdPoupanca < contasPoupancas.length) {
            ContaPoupanca conta = new ContaPoupanca(proximoNumero++, titular, depositoInicial);
            contasPoupancas[qtdPoupanca] = conta;
            qtdPoupanca++;
            System.out.println("\nConta Poupança criada com sucesso!");
            System.out.println("Número da conta: " + conta.getNumero());
        } else {
            System.out.println("Limite de contas poupança atingido!");
        }
    }

    public void listarContas() {
        System.out.println("\n=== CONTAS CORRENTES ===");
        if (qtdCorrente == 0) {
            System.out.println("Nenhuma conta corrente cadastrada.");
        } else {
            for (int i = 0; i < qtdCorrente; i++) {
                System.out.println(contasCorrentes[i]);
            }
        }

        System.out.println("\n=== CONTAS POUPANÇA ===");
        if (qtdPoupanca == 0) {
            System.out.println("Nenhuma conta poupança cadastrada.");
        } else {
            for (int i = 0; i < qtdPoupanca; i++) {
                System.out.println(contasPoupancas[i]);
            }
        }
    }

    public void realizarOperacao(int numeroConta, int tipoOperacao, double valor) {
        // Busca nas contas correntes
        for (int i = 0; i < qtdCorrente; i++) {
            if (contasCorrentes[i].getNumero() == numeroConta) {
                if (tipoOperacao == 1) {
                    contasCorrentes[i].depositar(valor);
                } else if (tipoOperacao == 2) {
                    contasCorrentes[i].sacar(valor);
                }
                return;
            }
        }

        // Busca nas contas poupança
        for (int i = 0; i < qtdPoupanca; i++) {
            if (contasPoupancas[i].getNumero() == numeroConta) {
                if (tipoOperacao == 1) {
                    contasPoupancas[i].depositar(valor);
                } else if (tipoOperacao == 2) {
                    contasPoupancas[i].sacar(valor);
                }
                return;
            }
        }

        System.out.println("Conta não encontrada!");
    }

    static void main() {
        Banco banco = new Banco();
        int opcao;

        do {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Criar Conta Corrente");
            System.out.println("2 - Criar Conta Poupança");
            System.out.println("3 - Listar Contas");
            System.out.println("4 - Realizar Operação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(IO.readln());

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CRIAR CONTA CORRENTE ---");
                    System.out.print("Nome do titular: ");
                    String titularCC = IO.readln();
                    System.out.print("Limite da conta: R$ ");
                    double limite = Double.parseDouble(IO.readln());
                    banco.criarContaCorrente(titularCC, limite);
                    break;

                case 2:
                    System.out.println("\n--- CRIAR CONTA POUPANÇA ---");
                    System.out.print("Nome do titular: ");
                    String titularCP = IO.readln();
                    System.out.print("Depósito inicial: R$ ");
                    double depositoInicial = Double.parseDouble(IO.readln());
                    banco.criarContaPoupanca(titularCP, depositoInicial);
                    break;

                case 3:
                    banco.listarContas();
                    break;

                case 4:
                    System.out.println("\n--- REALIZAR OPERAÇÃO ---");
                    System.out.print("Número da conta: ");
                    int numeroConta = Integer.parseInt(IO.readln());
                    System.out.println("1 - Depósito");
                    System.out.println("2 - Saque");
                    System.out.print("Tipo de operação: ");
                    int tipoOp = Integer.parseInt(IO.readln());
                    System.out.print("Valor: R$ ");
                    double valor = Double.parseDouble(IO.readln());
                    banco.realizarOperacao(numeroConta, tipoOp, valor);
                    break;

                case 0:
                    System.out.println("Obrigado por usar nosso banco!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para continuar...");
                IO.readln();
            }

        } while (opcao != 0);
    }
}