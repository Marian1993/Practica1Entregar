package com.company;

public class Metodes {


    public Metodes(){}

    //Opció 3
    public static int contadorCaracters(String[] frase){

        int numLletres = 0;


        for (int i = 0; i < frase.length; i++) {

            for (int j = 0; j < frase[i].length(); j++) {

                numLletres++;

            }
        }

        return numLletres;
    }
    //Opció 4
    public static int contadorParaules(String[] frase){

        int numParaules = 0;

        for (int i = 0; i < frase.length; i++) {

            numParaules++;
        }
        return numParaules;
    }
}
