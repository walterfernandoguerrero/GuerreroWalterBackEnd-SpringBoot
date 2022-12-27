
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.acercaDe;
import com.ejemplo.SpringBoot.service.IAcercaDeService;
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

@RequestMapping("informacion")
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class acercaDeController {
    @Autowired
    private IAcercaDeService infoServ;
    
    //end Points
    
    //crear Informacion
    @PostMapping("/crearInfo")
    public void crearInfo(@RequestBody acercaDe info){
        infoServ.crearInfo(info);
    }
    
    //consultar Personas
    @GetMapping("/verInfo")
    @ResponseBody
    public List<acercaDe>verInfo(){
        return infoServ.verInfo();
    }
    
    //borrar Persona
    @DeleteMapping("/delete/{id}")
    public void borrarInfo(@PathVariable int id){
        infoServ.borrarInfo(id);
    }
    
    //traer una informacion
    @GetMapping("/traerInfo")
    public acercaDe traerInfo(){
        return infoServ.buscarInfo((int)29);
    }
}
