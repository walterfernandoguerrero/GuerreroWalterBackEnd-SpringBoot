
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Lenguaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LenguajeRepository extends JpaRepository<Lenguaje, Integer>{
    
}
