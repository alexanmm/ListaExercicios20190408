package br.com.digitalhouse.Exercicio5;

public class Veiculo {

    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private String cor;
    private Double quilometragem;

    //Construtor
    public Veiculo( String marca,
                    String modelo,
                    Integer anoFabricacao,
                    String cor,
                    Double quilometragem){

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.quilometragem = quilometragem;

    }

    //Construtor Padrão
    public Veiculo(){

    }

    //Getter and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
