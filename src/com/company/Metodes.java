package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Metodes {


    public Metodes(){}

    public static int contadorCaracters(String[] frase){

        int numLletres = 0;

        for (int i = 0; i < frase.length; i++) {

            for (int j = 0; j < frase[i].length(); j++) {

                numLletres++;
            }
        }
        return numLletres;
    }
    public static int contadorParaules(String[] frase){

        int numParaules = 0;

        for (int i = 0; i < frase.length; i++) {

            numParaules++;
        }
        return numParaules;
    }
    public static String[] eliminarCaracters(String text){

        int lletra = 0;
        String mystring = text;
        ArrayList<String> arrayAux = new ArrayList<String>();
        char[] vocals =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
                't','u','v','w','x','y','z'};
         mystring = mystring.toLowerCase();
         mystring = mystring.replace(".","");
        mystring = mystring.replace(",","");
        mystring = mystring.replace("?","");
        mystring = mystring.replace(":","");
        String[] arrayText = mystring.split(" ");

        for (int i = 0; i < arrayText.length; i++) {

            for (int j = 0; j < arrayText[i].length(); j++) {

                for (int k = 0; k < vocals.length; k++) {

                    if(arrayText[i].charAt(j) == vocals[k] && lletra == 0){

                        arrayAux.add(arrayText[i]);
                        lletra++;
                    }
                }
                lletra = 0;
                break;
            }
        }

        return omplirArray(arrayAux);
    }
    private static String[] omplirArray(ArrayList<String> array){

        String[] newArray = new String[array.size()];

        for (int i = 0; i < array.size(); i++) {

            newArray[i] = array.get(i);

        }
        return newArray;
    }
}
