
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
            
            
   // List<Persona> listaPersonas = new ArrayList();
    //end Points
   /* @GetMapping ("/hola/{nombre}/{apellido}/{edad}")
    public String holaMundo(@PathVariable String nombre,
                            @PathVariable String apellido,
                            @PathVariable int edad){
        return "hola mundo" + nombre + " apellido: " + apellido +" edad: " + edad;
    }
    
    @GetMapping ("/chau")
    public String decirChau(@RequestParam String nombre,
                            @RequestParam String apellido,
                            @RequestParam int edad
                            ){
    return "chau Mundo  " + nombre + " apellido: " + apellido +" edad: " + edad;
    }*/
    
    //crear persona 
    @PostMapping ("/new/persona")
    public void agregarPersona( @RequestBody Persona pers){
    //listaPersonas.add(pers);
    persoServ.crearPersona(pers);
    }
    
    //consultar personas 
    @GetMapping ("/ver/personas")
    @ResponseBody
    public  List<Persona> verPersonas(){
        //return listaPersonas;
        return persoServ.verPersona();
    }
    
    //borrar persona
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
    persoServ.borrarPersona(id);
    }
    
    //traer una paersona
    @GetMapping ("/traer/perfil")
    public Persona buscarPersona(){
    return persoServ.buscarPersona((long)2);
    }
}
