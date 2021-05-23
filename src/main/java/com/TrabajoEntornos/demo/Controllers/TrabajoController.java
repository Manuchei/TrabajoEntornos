package com.TrabajoEntornos.demo.Controllers;


import java.util.Map;

import com.TrabajoEntornos.demo.models.TrabajoEntornosModel;
import com.TrabajoEntornos.demo.services.ContarVocales_y_Consonantes;
import com.TrabajoEntornos.demo.services.TrabajoEntornosBDService;
import com.TrabajoEntornos.demo.services.TransformarFrase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/* 
http://localhost:8080
*/
@RestController
public class TrabajoController {
    @Autowired
    ContarVocales_y_Consonantes contar;

    @GetMapping("/")
    public String explicacion() {
        return "Bienvenido a tu app, para contar las vocales y consonantes de una palabra escribe '/contar'" +
        "<br>"+ 
        "<br>"+

        "para guardar datos en la base de datos escribe '/insercionDatos'" + 
        "<br>"+
        "<br>"+

        "si quieres listar los datos de la base escribe '/listar datos'";
    }


    @GetMapping("/contar/{palabra}")
    public String contarVocalesYConsonantes(@PathVariable String palabra) {
        String resultado = ContarVocales_y_Consonantes.contarConsonantes(palabra);
        return resultado;
    }
    @GetMapping("/contar1")
    public String contar1() {
        return "hola";
    }
    @Autowired
    TrabajoEntornosBDService trabajoBDservice;
    @PostMapping("/insertaDatos")
    public String insertaDatos(@RequestParam Map<String, String> body) {
        System.out.println(body.get("dato"));
        TrabajoEntornosModel entornosModel = new TrabajoEntornosModel();
        entornosModel.setDato(body.get("dato"));
        trabajoBDservice.guardarDatos(entornosModel);
        return "guardado correctamente";
    }
    @GetMapping("/listarDatos")
    public String listarDatos() {
        return trabajoBDservice.devuelveDatos().toString();
    }
    
    @GetMapping("/fraseAlreves/{texto}")
    public String fraseAlreves(@PathVariable String texto){
        String fraseAlreves = TransformarFrase.fraseAlreves(texto);
        return "La frase original es: " + texto + " y la frase al revés es: " + fraseAlreves;
    }
}
