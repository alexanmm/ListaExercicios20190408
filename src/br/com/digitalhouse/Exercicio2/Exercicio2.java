package br.com.digitalhouse.Exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {

        JogadorDeFutebol jogadorCarlos = new JogadorDeFutebol("Carlos", 1, 2, 3, 2);
        JogadorDeFutebol jogadorAntonio = new JogadorDeFutebol("Antonio", 10, 5, 1, 1);

        SessaoDeTreinamento treinamentoCarlos = new SessaoDeTreinamento(jogadorCarlos.getExperiencia());
        SessaoDeTreinamento treinamentoAntonio = new SessaoDeTreinamento(jogadorAntonio.getExperiencia());


        //Treinamento do Carlos
        System.out.println("Jogador: " + jogadorCarlos.getNome());
        treinamentoCarlos.treinarA(jogadorCarlos);

        //Treinamento do Antônio
        System.out.println("Jogador: " + jogadorAntonio.getNome());
        treinamentoAntonio.treinarA(jogadorAntonio);

    }


}
