package br.com.digitalhouse.Exercicio5;

import java.util.ArrayList;

public class Concessionaria {

    //Inicializa Array com o registro das vendas
    private ArrayList<Venda> arrayRegistroVendas = new ArrayList<Venda>();

    //Registrar a venda
    public void registrarVenda(Veiculo veiculo, Cliente cliente, Double valorVenda){

        //Inicializa linha para adicionar ao Array de Vendas
        Venda linhaVendas = new Venda(cliente, veiculo, valorVenda);

        arrayRegistroVendas.add(linhaVendas);

    }

    //Exibir vendas realizadas
    public void exibirVendas(){

        for (Venda linha: arrayRegistroVendas){
            System.out.println(
                    "Cliente: " + linha.getCliente().getNome()  +
                    " Veiculo: " + linha.getVeiculo().getMarca() +
                    " Valor Venda:" + linha.getValorVenda());
        }

    }



}
