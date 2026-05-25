package Aula_25052026.Acesse_Exe;

public class Pessoa {
    //Atributo de acesso publicos
    public String nome;
    //Atributo de acesso protegido
    protected String sobrenome;
    //Atributo de acesso de pacote (sem modificador)
    String email;
    //Atributo de acesso privado
    private String cpf;

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        //validação
        this.cpf = cpf;
    }
}
