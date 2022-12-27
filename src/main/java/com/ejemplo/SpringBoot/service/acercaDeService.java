
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.acercaDe;
import com.ejemplo.SpringBoot.repository.acercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class acercaDeService implements IAcercaDeService{
    
    @Autowired
    public acercaDeRepository infoRepo;

    @Override
    public List<acercaDe> verInfo() {
        return infoRepo.findAll();
    }

    @Override
    public void crearInfo(acercaDe info) {
        infoRepo.save(info);
    }

    @Override
    public void borrarInfo(int id) {
        infoRepo.deleteById(id);
    }

    @Override
    public acercaDe buscarInfo(int id) {
        return infoRepo.findById(id).orElse(null);
    }
  
  
  
}
