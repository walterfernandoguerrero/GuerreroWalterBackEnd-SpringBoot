
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Lenguaje;
import java.util.List;


public interface ILenguajeService {
    public List<Lenguaje>verLenguajes();
    public void crearLenguaje(Lenguaje leng);
    public void borrarLenguaje(int id);
    public Lenguaje buscarLenguaje(int id);
    
}
