package com.TrabajoEntornos.demo.services;

import org.springframework.stereotype.Service;

@Service
public class TransformarFrase {
    public static String fraseAlreves(String texto) {
        String textoReves = "";
        int textoLongitud = texto.length();
        for (int i = textoLongitud-1; i >= 0; i--) {
            textoReves += texto.charAt(i);
        }
        return textoReves;
    }


}
