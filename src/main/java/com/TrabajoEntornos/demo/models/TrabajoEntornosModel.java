package com.TrabajoEntornos.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="datos")
public class TrabajoEntornosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique=true,nullable=false)
    private Long id;
    private String dato;

    /*la fecha y hora se rellenan automaticamente */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fecha; //si no pones fecha, será la del sistema

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "TrabajoEntornosModel [dato=" + dato + ", fecha=" + fecha + ", id=" + id + "]";
    }


}

    

