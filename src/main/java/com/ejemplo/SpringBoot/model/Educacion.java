
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreEdu;
    private String descripcionEdu;

    //constructor vacio
    public Educacion() {
    }
    //constructor instancia con datos

    public Educacion(int id, String nombreEdu, String descripcionEdu) {
        this.id = id;
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
    }
    
    
}
