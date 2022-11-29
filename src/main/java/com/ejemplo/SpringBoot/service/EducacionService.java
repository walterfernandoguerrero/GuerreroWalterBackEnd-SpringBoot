
package com.ejemplo.SpringBoot.service;

//antes de esta clase hacer  IEducacionService

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; //clase Abstrapta

@Service
public class EducacionService implements IEducacionService  {
    
    @Autowired
    
    //variable de tipo EducacionRepository
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEstudios() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEstudio(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEstudio(int id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEstudio(int id) {
        return eduRepo.findById(id).orElse(null);
    }
    //falta editar
    @Override
    public void actualizarEstudio(Educacion edu){
        eduRepo.saveAndFlush(edu);
    }
}
