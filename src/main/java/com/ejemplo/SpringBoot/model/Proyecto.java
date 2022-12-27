
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;
    private String titulo;
    private String lenguaje;
    private String herramientas;
    private String detalle;
    private String git;
    
    //constructor 

    public Proyecto() {
    }

    public Proyecto(int id, String titulo, String lenguaje, String herramientas) {
        this.id = id;
        this.titulo = titulo;
        this.lenguaje = lenguaje;
        this.herramientas = herramientas;
    }
    
    
    
    
}
