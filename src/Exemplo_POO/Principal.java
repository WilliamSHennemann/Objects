package Exemplo_POO;

public class Principal {
    static void main() {
        //Criando uma nova isntancia
        String nome = IO.readln("Qual o nome do aluno: ");
        Aluno aluno = new Aluno(nome);
        Caneta caneta = new Caneta();
        Carro carro1 = new Carro();
        //Atribuindo valores para esta instância
        /*carro1.modelo = IO.readln("Qual o modelo do carro: ");
        carro1.marca = IO.readln("Qual a marca do "+carro1.modelo+": ");
        carro1.cor = IO.readln("Qual a cor do "+carro1.modelo+": ");
        carro1.km = Integer.parseInt(IO.readln("Qual a kilometragem do carro:"));
        carro1.anoFabricaçao = Integer.parseInt(IO.readln("Qual o ano de fabricação do carro:"));
        carro1.abastecer(Integer.parseInt(IO.readln("Quantos litros serão abastecidos:")));
        carro1.andar(Integer.parseInt(IO.readln("Quao rapido o carro andara:")));
        carro1.parar();*/

        /*
        caneta.fabricante = IO.readln("Qual a fabricante da caneta:");
        caneta.cor = IO.readln("Qual a cor da caneta:");
        caneta.quantidadeTinta = 10;
        for (int i = 0; i < 20; i++) {
            caneta.escrever("Escrevendo a linha "+(i+1));

        }*/

        aluno.notaUm = Float.parseFloat(IO.readln("Qual a primeira nota do "+aluno.nome+": "));
        aluno.notaDois = Float.parseFloat(IO.readln("Qual a segunda nota do "+aluno.nome+": "));
        aluno.notaTres = Float.parseFloat(IO.readln("Qual a terceira nota do "+aluno.nome+": "));
        float media = aluno.calculaMedia();
        IO.println("O aluno "+aluno.nome+" tem media "+ aluno.media+" e está "+aluno.retornaStatus());


    }
}
