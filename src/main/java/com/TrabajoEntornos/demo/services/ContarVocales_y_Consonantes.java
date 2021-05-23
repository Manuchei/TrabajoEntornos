package com.TrabajoEntornos.demo.services;

public class ContarVocales_y_Consonantes {

    public static boolean esVocal(char letra){

        /*if(String.valueOf(letra).toLowerCase().contains("aeiou")) return true;
        else return false;*/

        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }

    public static String contarConsonantes(String palabra){

        int contadorConsonantes =0;
        int contadorVocales =0;


        int longitudPalabra=palabra.length();

        for (int i = 0; i < longitudPalabra; i++) {
            if(esVocal(palabra.charAt(i))) contadorConsonantes++;
            else contadorVocales++;
        }
        return "El número de consonantes es: " + contadorConsonantes  +  " y el número de vocales es: " + contadorVocales;
    }
}
    

