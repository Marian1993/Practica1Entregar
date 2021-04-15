package com.company;

import java.util.ArrayList;

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
    public static String eliminarCaracters(String text){

        String mystring = text;
        String[] arrayText = text.split(" ");
        ArrayList<String> arrayAux = new ArrayList<String>();

        mystring = mystring.replace("."," ");
        mystring = mystring.replace(","," ");
        mystring = mystring.replace("?"," ");
        mystring = mystring.replace("-"," ");
        mystring = mystring.replace("_"," ");
        mystring = mystring.replace(":"," ");
        mystring = mystring.replace(";"," ");

        for (int i = 0; i < arrayText.length; i++) {

            for (int j = 0; j < arrayText[i].length(); j++) {

                if(mystring.charAt(i) == ' '){

                }

            }


        }
        return mystring;
    }



}
