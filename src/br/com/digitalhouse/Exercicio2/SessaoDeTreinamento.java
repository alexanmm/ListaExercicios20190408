package br.com.digitalhouse.Exercicio2;

public class SessaoDeTreinamento {

    private Integer experienciaTreino;

    //Construtor
    public SessaoDeTreinamento(Integer experienciaInicial){

        this.experienciaTreino = experienciaInicial;

    }

    //Construtor Padrão
    public SessaoDeTreinamento(){

    }

    //TreinamentoA
    public void treinarA(JogadorDeFutebol jogador){

        //Experiência inicial
        System.out.println("Experiência inicial: " + String.valueOf(experienciaTreino));

        jogador.correr();
        jogador.fazerGol();
        jogador.correr();

        // + 1 ponto de experiência
        experienciaTreino = experienciaTreino + 1;

        //Experiência final
        System.out.println("Experiência final: " + String.valueOf(experienciaTreino));

    }

    //Getter and Setter
    public Integer getExperienciaTreino() {
        return experienciaTreino;
    }

    public void setExperienciaTreino(Integer experienciaTreino) {
        this.experienciaTreino = experienciaTreino;
    }

}
