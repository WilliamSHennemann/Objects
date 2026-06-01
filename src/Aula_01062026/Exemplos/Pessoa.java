package Aula_01062026.Exemplos;

public class Pessoa {
    private String nome;
    private String mail;
    private static int contAlunos;


public void setnome (String nome) {
    if (nome != null && nome.length() >= 3){
        this.nome = nome;
    }
}

public String getNome (){
    return nome;
}

public void setMail (String mail){
    this.nome = nome;
}

public String getMail () {
    return mail;
}

public Pessoa() {
    contAlunos++;
}

public static int getContAlunos() {
    return contAlunos;
}
}