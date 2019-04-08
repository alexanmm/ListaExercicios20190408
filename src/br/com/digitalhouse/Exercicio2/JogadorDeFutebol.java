package br.com.digitalhouse.Exercicio2;

public class JogadorDeFutebol {

    private String  nome;
    private Integer energia;
    private Integer alegria;
    private Integer gols;
    private Integer experiencia;

    //Construtor
    public JogadorDeFutebol( String  nome,
                             Integer energia,
                             Integer alegria,
                             Integer gols,
                             Integer experiencia){

        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;

    }

    //Construtor Padrão
    public JogadorDeFutebol(){

    }

    //Fazer gol
    public void fazerGol(){

        // - 5 pontos de energia
        energia = energia - 5;

        // + 10 pontos de alegria
        alegria = alegria + 10;

        // + 1 gol
        gols = gols + 1;
        System.out.println("GOOOOL!");

    }

    //Correr
    public void correr(){

        // - 10 pontos de energia
        energia = energia - 10;
        System.out.println("Cansei");

    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getAlegria() {
        return alegria;
    }

    public void setAlegria(Integer alegria) {
        this.alegria = alegria;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }
}
