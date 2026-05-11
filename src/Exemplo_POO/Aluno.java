package Exemplo_POO;

public class Aluno {
    String nome;
    float notaUm;
    float notaDois;
    float notaTres;
    float media;

    Aluno(){

    }

    Aluno(String nome){
        this.nome = nome;
    }

    float calculaMedia(){
        media = (notaUm+notaDois+notaTres)/3;
        return media;
    }

    String retornaStatus(){
        if (media >= 8) {
            return  "Aprovado";
        }
        else if (media < 8 && media> 3) {
            return  "Recuperação";
        }
        else {
            return  "Reprovado<3";
        }
    }

}
