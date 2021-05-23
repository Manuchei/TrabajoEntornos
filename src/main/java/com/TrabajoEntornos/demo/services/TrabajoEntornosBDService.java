package com.TrabajoEntornos.demo.services;

import com.TrabajoEntornos.demo.repositories.TrabajoEntornosRepository;

import java.util.ArrayList;

import com.TrabajoEntornos.demo.models.TrabajoEntornosModel;

import org.springframework.beans.factory.annotation.Autowired;

public class TrabajoEntornosBDService {

    @Autowired
    TrabajoEntornosRepository entornosRepository;

    /* recibe un objeto del tipo del modelo como parámetro y lo guarda en la base de
     * datos con 'save' */
    public TrabajoEntornosModel guardarDatos(TrabajoEntornosModel modeloDatos){
        return entornosRepository.save(modeloDatos);
    }

    /*devuelve un arrayList del tipo modelo con los datos guardados en la base de datos,
    el método 'findAll' lo provee JPA*/
    public ArrayList<TrabajoEntornosModel> devuelveDatos(){
        return (ArrayList<TrabajoEntornosModel>) entornosRepository.findAll();
    }


}

