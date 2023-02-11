
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Lenguaje;
import com.ejemplo.SpringBoot.service.ILenguajeService;
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

@RequestMapping("lenguaje")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LenguajeController {
    @Autowired
    private ILenguajeService lengServ; //variable
    //end points
    
//consultar lenguajes
    @GetMapping("/verLenguajes")
    @ResponseBody
    public List<Lenguaje>verLenguajes(){
        return lengServ.verLenguajes();
    }
//crear lenguaje
    @PostMapping("/nuevoLenguaje")
    public void agregarLenguaje(@RequestBody Lenguaje leng){
        lengServ.crearLenguaje(leng);
    }
//borrar lenguaje
    @DeleteMapping("/borrarLenguaje/{id}")
    public void borrarLenguaje(@PathVariable int id){
        lengServ.borrarLenguaje(id);
    }
//traer un lenguaje 
    @GetMapping("/buscarLenguaje/{id}")
    public Lenguaje buscarLenguaje(@PathVariable int id){
        return lengServ.buscarLenguaje(id);
    }
}
