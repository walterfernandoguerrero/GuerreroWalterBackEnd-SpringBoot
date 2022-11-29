
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService  implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expeRepo; //variable
    
    @Override
    public List<Experiencia> verExperiencia(){
    return expeRepo.findAll();
    }
    
   
   /* @Override
    public Optional<Experiencia> getNombreE(String nombreE) {
        return expeRepo.finByNombreE(nombreE);
    }*/

    @Override
    public void borrarExperiencia(int id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(int id) {
        return expeRepo.findById(id).orElse(null);
    }

    /*@Override
    public boolean existsById(int id) {
        return expeRepo.existsById(id);
    }

    @Override
    public boolean existsByNombreE(String nombreE) {
        return expeRepo.existsByNombreE(nombreE);
    }*/

    @Override
    public void crearExperiencia(Experiencia exp) {
        expeRepo.save(exp);
    }
    
}
