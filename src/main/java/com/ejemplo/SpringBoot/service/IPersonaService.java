
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> verPersona();
    //guardar un objeto de tipo persona 
    public void crearPersona (Persona per);
    //eliminar objeto por id
    public void borrarPersona(Long id);
    //Buscar una persona por Id
    public Persona buscarPersona (Long id);
     
}
