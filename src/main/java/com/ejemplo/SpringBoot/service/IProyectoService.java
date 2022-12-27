
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto>verProyectos();
    public void crearProyecto(Proyecto proy);
    public void borrarProyecto(int id);
    public Proyecto buscarProyecto(int id);   
}
