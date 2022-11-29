
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion>verEstudios();//listar
    public void crearEstudio(Educacion edu);//crear estudio
    public void borrarEstudio(int id);//borrar una educacion
    public Educacion buscarEstudio(int id);//buscar un estudio
    //falta editar 
    public void actualizarEstudio(Educacion edu);
}
