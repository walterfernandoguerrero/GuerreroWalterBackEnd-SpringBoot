
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Lenguaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String nombreLenguaje;
    private int porcentaje;

    public Lenguaje() {
    }

    public Lenguaje(int Id, String nombreLenguaje, int porcentaje) {
        this.Id = Id;
        this.nombreLenguaje = nombreLenguaje;
        this.porcentaje = porcentaje;
    }
    
}
