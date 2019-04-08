package br.com.digitalhouse.Exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {

        //Inicializa dados do Veiculo
        Veiculo carro = new Veiculo("Celta", "Spirit", 2006, "Prata", 20000.00d);

        //Inicializa dados do Cliente
        Cliente clienteFabio = new Cliente("Fabio", "Junior", "e-mail fabio.junior@yahoo.com.br");

        //Inicializa dados da Concessionária
        Concessionaria concessionariaTatuape = new Concessionaria();

        //Registra o valor da Primeira venda
        concessionariaTatuape.registrarVenda(carro, clienteFabio, 14000.00d);

        //Exibe as vendas realizada
        concessionariaTatuape.exibirVendas();

    }

}
