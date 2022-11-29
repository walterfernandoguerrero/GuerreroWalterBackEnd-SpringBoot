
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.datosPersonales;
import com.ejemplo.SpringBoot.repository.datosPersonalesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class datosPersonalesService implements IdatosPersonalesService {
    @Autowired
    public datosPersonalesRepository datosRepo; //variable

    @Override
    public List<datosPersonales> verDatos() {
        return datosRepo.findAll();
    }

    @Override
    public void crearDatos(datosPersonales datos) {
        datosRepo.save(datos);
    }

    @Override
    public void borrarDatos(int id) {
        datosRepo.deleteById(id);
    }

    @Override
    public datosPersonales buscarDatos(int id) {
        return datosRepo.findById(id).orElse(null);
    }
    
}
