package br.com.digitalhouse.ExercicioAdicional;

public class Prova {

    private Integer dificuldade;
    private Integer energiaNecessaria;

    //Construtor
    public Prova( Integer dificuldade,
                  Integer energiaNecessaria){

        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;

    }

    //Cosntrutor Padrão
    public Prova(){

    }

    //Pode realizar a Prova
    public Boolean podeRealizar(Atleta atleta) {

        if (    atleta.getNivel()   >= dificuldade
                && atleta.getEnergia() >= energiaNecessaria ){ //Pode realizar prova

            return true;

        } else { //Não pode realizar a prova
            return false;
        }

    }

    //Getter and Setter
    public Integer getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Integer getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(Integer energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }
}
