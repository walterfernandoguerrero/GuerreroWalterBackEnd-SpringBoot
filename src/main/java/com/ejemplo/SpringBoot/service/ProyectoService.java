
package com.ejemplo.SpringBoot.service;


import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyRepo;

    @Override
    public List<Proyecto> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(int id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(int id) {
        return proyRepo.findById(id).orElse(null);
    }
    
}

    
    

