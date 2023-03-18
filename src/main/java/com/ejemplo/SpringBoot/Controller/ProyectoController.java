
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.service.IProyectoService;
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

@RequestMapping("proy")
@RestController
//@CrossOrigin (origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://portfolio-frontend-guerrero.web.app"})
public class ProyectoController {
    @Autowired
    private IProyectoService proyServ; 
    
    //end points
    
    //listar Proyectos
    @GetMapping("/verProyectos")
    @ResponseBody
    public List<Proyecto>verProyectos(){
        return proyServ.verProyectos();
    }
    
    //crear Proyecto
    @PostMapping("/nuevoProyecto")
    public void nuevoProyecto(@RequestBody Proyecto proy){
        proyServ.crearProyecto(proy);
    }
    
    //borrar proyecto
    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable int id){
        proyServ.borrarProyecto(id);
    }
    
    //traer Proyecto
    @GetMapping("/traerProyecto/{id}")
    public Proyecto buscarProyecto(@PathVariable int id){
        return proyServ.buscarProyecto(id);
    }
}
