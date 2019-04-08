package br.com.digitalhouse.Exercicio1;

public class Cliente {

    private String nome;
    private String sobrenome;

    //Construtor
    public Cliente(String nome, String sobrenome){

        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    //Construtor Padrão
    public Cliente(){

    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
