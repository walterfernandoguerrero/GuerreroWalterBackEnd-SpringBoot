
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Lenguaje;
import com.ejemplo.SpringBoot.repository.LenguajeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LenguajeService implements ILenguajeService {
    @Autowired
    public LenguajeRepository lengRepo;

    @Override
    public List<Lenguaje> verLenguajes() {
        return lengRepo.findAll();
    }

    @Override
    public void crearLenguaje(Lenguaje leng) {
        lengRepo.save(leng);
    }

    @Override
    public void borrarLenguaje(int id) {
        lengRepo.deleteById(id);
    }

    @Override
    public Lenguaje buscarLenguaje(int id) {
        return lengRepo.findById(id).orElse(null);
    }
    
    
}
