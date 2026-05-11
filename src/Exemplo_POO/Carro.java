package Exemplo_POO;

public class Carro {
    //Atributos do carro
    String marca;
    String modelo;
    int km;
    String cor;
    int anoFabricaçao;

    //Metodos ou ações do carro
        void abastecer(int quantLitros){
            IO.println(modelo+" esta abastecendo "+quantLitros+" Litros");
        }

    void andar(int velocidade){
        IO.println(modelo+" esta andando a "+velocidade+"km/h");
    }

    void parar(){
        IO.println(modelo+" esta parado");
    }
}
