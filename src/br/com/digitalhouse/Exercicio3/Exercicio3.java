package br.com.digitalhouse.Exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {

        //Inicializa dados de cada atleta
        Atleta atletaJonas = new Atleta("Jonas", 10, 5);
        Atleta atletaVinicios = new Atleta("Vinicios", 1, 2);

        //Inicializa os dados das 3 provas
        Prova prova1 = new Prova(1, 1);
        Prova prova2 = new Prova(1, 2);
        Prova prova3 = new Prova(5,3);

        //Avaliação do Jonas
        System.out.println("Atleta: " + atletaJonas.getNome());

        System.out.println("Pode realizar a Prova 1? " + prova1.podeRealizar(atletaJonas));
        System.out.println("Pode realizar a Prova 2? " + prova2.podeRealizar(atletaJonas));
        System.out.println("Pode realizar a Prova 3? " + prova3.podeRealizar(atletaJonas));

        //Avaliação do Vinicios
        System.out.println("Atleta: " + atletaVinicios.getNome());
        System.out.println("Pode realizar a Prova 1? " + prova1.podeRealizar(atletaVinicios));
        System.out.println("Pode realizar a Prova 2? " + prova2.podeRealizar(atletaVinicios));
        System.out.println("Pode realizar a Prova 3? " + prova3.podeRealizar(atletaVinicios));

    }


}
