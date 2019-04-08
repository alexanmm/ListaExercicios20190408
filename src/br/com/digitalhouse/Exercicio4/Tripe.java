package br.com.digitalhouse.Exercicio4;

public class Tripe {

    private Boolean dobrado;
    private Float alturaMinima;
    private Float alturaMaxima;
    private Float alturaAtual;

    //Construtor
    public Tripe( Boolean dobrado,
                  Float alturaMinima,
                  Float alturaMaxima,
                  Float alturaAtual ){

        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;

    }


    //Construtor Padrao
    public Tripe(){

    }


    //Definir Altura
    public void definirAltura(Float novaAltura) {

        //Redefinir a altura atual
        alturaAtual = novaAltura;

    }

    //Dobrar
    public void dobrar() {

        dobrado = true;

    }

    //Desdobrar
    public void desdobrar() {

        dobrado = false;

    }

    //Guardar
    public Boolean guardar() {

        //Prepara o Tripé para guardar
        if (prontoParaGuardar() == true) {
            dobrar();

            return true;

        } else {
            return false;
        }
    }

    //Pronto para guardar
    public Boolean prontoParaGuardar() {

        if (dobrado == true && alturaMinima == alturaAtual){ //Pronto para guardar
            return true;
        } else {
            return false;
        }

    }

    //Usar o Tripé
    public Boolean usar() {

        if (prontoParaUsar() == true){ //Pronto para uso
            desdobrar();

            return true;

        } else {
            return false;
        }

    }

    //Pronto para usar
    public Boolean prontoParaUsar(){

        if (dobrado == false && alturaAtual > (alturaMaxima / 2)) { //Pronto para usar
            return true;
        } else {
            return false;
        }

    }

    //Getter and Setter
    public Boolean getDobrado() {
        return dobrado;
    }

    public void setDobrado(Boolean dobrado) {
        this.dobrado = dobrado;
    }

    public Float getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(Float alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public Float getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(Float alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public Float getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(Float alturaAtual) {
        this.alturaAtual = alturaAtual;
    }
}
