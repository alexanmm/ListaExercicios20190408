package br.com.digitalhouse.Exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {

        //Inicializa valores do Tripe
        Tripe tripe = new Tripe(true, 0.5F, 1.7F, 0.5F);

        //Verifica se o Tripe está pronto para uso
        if (tripe.prontoParaUsar() == true){ //Pronto para usar

            tripe.usar();

        } else { //Preparar para uso

            tripe.definirAltura(1.2F);
            tripe.usar();
        }

        //Guardar o Tripe
        if (tripe.prontoParaGuardar() == true){// Pronto para guardar

            tripe.guardar();

        } else { //Preparar para guardar

            tripe.definirAltura(0.5F);
            tripe.guardar();

        }

        ;




    }

}
