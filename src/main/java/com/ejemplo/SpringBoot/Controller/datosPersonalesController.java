
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.datosPersonales;
import com.ejemplo.SpringBoot.service.IdatosPersonalesService;
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

@RequestMapping("datos")
@RestController
//@CrossOrigin (origins="http://localhost:4200")
@CrossOrigin(origins = {"https://portfolio-frontend-guerrero.web.app"})
public class datosPersonalesController {
    @Autowired
    private IdatosPersonalesService datosServ;
    //end points
    
    //crear datosPersonales
    @PostMapping("/crearDatos")
    public void crearDatos(@RequestBody datosPersonales datos){
        datosServ.crearDatos(datos);
    }
    
    //consultar datos
    @GetMapping("/verDatos")
    @ResponseBody
    public List<datosPersonales>verDatos(){
        return datosServ.verDatos();
    }
    
    //borrar datos
    @DeleteMapping("/delete/{id}")
    public void borrarDatos(@PathVariable int id){
        datosServ.borrarDatos(id);
    }
    
    //traer persona
    @GetMapping("/traerDatos/{id}")
    public datosPersonales buscarDatos(@PathVariable int id){
        return datosServ.buscarDatos(id);
    }
}
