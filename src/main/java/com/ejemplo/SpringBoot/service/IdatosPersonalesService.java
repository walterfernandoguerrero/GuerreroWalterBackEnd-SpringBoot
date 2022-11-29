
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.datosPersonales;
import java.util.List;


public interface IdatosPersonalesService {
    public List<datosPersonales>verDatos();
    public void crearDatos(datosPersonales datos);
    public void borrarDatos(int id);
    public datosPersonales buscarDatos(int id);
}
