package br.com.digitalhouse.Exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {

        //Inicializa os dados de cada cliente
        Cliente clienteAlexandre = new Cliente("Alexandre", "Maia");
        Cliente clienteJoao = new Cliente("João", "Silva");

        //Inicializa os dados da conta para cada cliente
        Conta contaAlexandre = new Conta(12312, 130.00f, clienteAlexandre);
        Conta contaJoao = new Conta(3321, 10.00f, clienteJoao);

        //Cliente Alexandre
        //***
        System.out.println("Cliente: " + clienteAlexandre.getNome());

        //Depósito
        contaAlexandre.depositar(40.00f);

        //Saque
        contaAlexandre.sacar(100.00f);

        //Cliente João
        //***
        System.out.println("Cliente: " + clienteJoao.getNome());

        //Depósito
        contaJoao.depositar(1.05f);

        //Saque
        contaJoao.sacar(30.00f);

    }

}
