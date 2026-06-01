package Aula_01062026.Exercicios.Sistema_estacionamento;

public class Veiculo {
    private String placa;
    private String modelo;
    private int horasEstacionado;
    private static int vagasOcupadas = 0;
    private static double valorHora = 5.00;

    public void registrarEntrada(String placa, String modelo, int horas) {
        this.placa = placa;
        this.modelo = modelo;
        setHorasEstacionado(horas);
        vagasOcupadas++;
        System.out.println("Veículo " + placa + " entrou no estacionamento");
    }

    public void setHorasEstacionado(int horas) {
        if (horas >= 0) {
            this.horasEstacionado = horas;
        } else {
            System.out.println("Erro: Horas não pode ser negativo!");
            this.horasEstacionado = 0;
        }
    }

    public double calcularValor() {
        return horasEstacionado * valorHora;
    }

    public void sair() {
        double valor = calcularValor();
        System.out.println("Veículo " + placa + " saiu");
        System.out.println("Horas: " + horasEstacionado);
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
        liberarVaga();
    }

    public void liberarVaga() {
        vagasOcupadas--;
        System.out.println("Vaga liberada! Vagas ocupadas: " + vagasOcupadas);
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Horas: " + horasEstacionado);
        System.out.println("---");
    }

    public static void mostrarVagasOcupadas() {
        System.out.println("Vagas ocupadas: " + vagasOcupadas);
    }

    // Getters
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public int getHorasEstacionado() { return horasEstacionado; }
    public static double getValorHora() { return valorHora; }
}
