package com.TrabajoEntornos.demo.Controllers;


import com.TrabajoEntornos.demo.services.TraduceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TraductorController {

    @Autowired
    TraduceService traduceService;

    @RequestMapping("/traduce/{frase}")
    public  String traduce(@PathVariable String frase, Model modelo){
        String translatedText= traduceService.getTraduccion(frase);
        modelo.addAttribute("frase", frase);
        modelo.addAttribute("translatedText", translatedText);
        return "traduccion";
    }

}