
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.acercaDe;
import java.util.List;


public interface IAcercaDeService {
    
    public List<acercaDe>verInfo();
    public void crearInfo(acercaDe info);
    public void borrarInfo(int id);
    public acercaDe buscarInfo(int id);
}
