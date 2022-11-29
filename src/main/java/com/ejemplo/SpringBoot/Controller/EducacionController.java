
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("edu")
@CrossOrigin(origins = "http://localhost:4200")

public class EducacionController {
    @Autowired
    //variable de la interfaz con los metodos
    private IEducacionService eduServi;
    
    //los end Points
    
    //crear Educacion
    @PostMapping("/crearEstudio")
    public void crearEstudio(@RequestBody Educacion edu){
        eduServi.crearEstudio(edu);
    }
    
    //consultar Educacion
    @GetMapping ("/verEstudios")
    @ResponseBody
    public List<Educacion>verEstudios(){
        return eduServi.verEstudios();
    }
    
    //borrar Educacion
    @DeleteMapping("/delete/{id}")
    public void borrarEstudio(@PathVariable int id){
        eduServi.borrarEstudio(id);
    }
    
    //traer un estudio
    @GetMapping ("/buscarEstudio/{id}")
    public Educacion buscarEstudio(@PathVariable int id){
        return eduServi.buscarEstudio(id);
    }
    
    //prueba editar
    @PutMapping ("/editarEstudio")
    public void actualizarEstudio(@RequestBody Educacion edu){
        eduServi.actualizarEstudio(edu);
    }
    
    
}
