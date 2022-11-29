
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import java.util.List;
import java.util.Optional;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
   /* public Optional<Experiencia> getNombreE(String nombreE);*/
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia (int id);
    public Experiencia buscarExperiencia(int id);
   /* public boolean existsById(int id);

    
    public boolean existsByNombreE(String nombreE);*/
}
