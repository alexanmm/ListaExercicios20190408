package br.com.digitalhouse.Exercicio1;

public class Conta {

    private Integer numeroConta;
    private Float   saldoConta;
    private Cliente clienteTitular;

    //Construtor
    public Conta( Integer numeroConta,
                  Float   saldoConta,
                  Cliente clienteTitular){

        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.clienteTitular = clienteTitular;
    }

    //Construtor Padrão
    public Conta(){

    }


    //Depósito
    public void depositar(Float valorDeposito){

        saldoConta = saldoConta + valorDeposito;

        System.out.println("Tipo de transação: Depósito em Dinheiro");
        System.out.println("Saldo da conta: " + String.valueOf(saldoConta));
    }

    //Saque
    public void sacar(Float valorSaque) {

        if (saldoConta < valorSaque) { //Saldo insuficiente
            System.out.println("Saldo insuficiente");

        } else { //Atualiza saldo de acordo com o valor de saque
            saldoConta = saldoConta - valorSaque;

            System.out.println("Tipo de transação: Saque em Dinheiro");
            System.out.println("Saldo da conta: " + String.valueOf(saldoConta));
        }

    }

    //Getter and Setter
    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }
}
