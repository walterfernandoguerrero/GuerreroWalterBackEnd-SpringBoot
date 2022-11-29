
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;
    private String nombreExp;
    private String descripcionExp;

    public Experiencia() {
    }

    public Experiencia(int id, String nombreExp, String descripcionExp) {
        this.id = id;
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
    }
    
}
