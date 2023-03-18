
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.service.IExperienciaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("explab")
//@CrossOrigin(origins = "http://localhost:4200" )
@CrossOrigin(origins = {"https://portfolio-frontend-guerrero.web.app"})
public class ExperienciaController {
    @Autowired
    private IExperienciaService expeServ; //variable
    List<Experiencia> listaEsperiencia = new ArrayList();
    
    //end points 
    
    //crear experiencia
    @PostMapping ("/nuevaExperiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expeServ.crearExperiencia(exp);
    }
    
    //consultar experiencia
    @GetMapping("/verExperiencias")
    @ResponseBody
    public List<Experiencia>verExperiencia(){
        return expeServ.verExperiencia();
    }   
    
    //traer una experiencia
    @GetMapping("/traerExperiencia/{id}")
    public Experiencia buscarEsperiencia(@PathVariable int id){
    return expeServ.buscarExperiencia(id);
    }
    
    //borrar una experiencia
    @DeleteMapping("/borrarExperiencia/{id}")
    public void borrarExperiencia(@PathVariable int id){
        expeServ.borrarExperiencia(id);
    }
}
