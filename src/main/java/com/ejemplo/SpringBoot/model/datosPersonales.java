
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class datosPersonales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String mail;
    private String telefono;
    private String direccion;
    private String imagen;

    public datosPersonales() {
    }

    public datosPersonales(int id, String nombre, String mail, String telefono, String direccion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.direccion = direccion;
        this.imagen=imagen;
    }
}
