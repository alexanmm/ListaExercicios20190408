package br.com.digitalhouse.Exercicio5;

public class Venda {

    private Cliente cliente;
    private Veiculo veiculo;
    private Double  valorVenda;

    //Construtor
    public Venda(Cliente cliente,
                 Veiculo veiculo,
                 Double  valorVenda){

        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorVenda = valorVenda;

    }

    //Construtor Padrão
    public Venda(){

    }

    //Getter and Setter
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
