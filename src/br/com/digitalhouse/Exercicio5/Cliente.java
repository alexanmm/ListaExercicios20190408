package br.com.digitalhouse.Exercicio5;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String contato;

    //Construtor
    public Cliente ( String nome,
                     String sobrenome,
                     String contato){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;

    }

    //Construtor Padrão
    public Cliente (){

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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
