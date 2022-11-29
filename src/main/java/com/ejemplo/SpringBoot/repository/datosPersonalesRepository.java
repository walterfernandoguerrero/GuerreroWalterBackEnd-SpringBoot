
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.datosPersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface datosPersonalesRepository extends JpaRepository<datosPersonales, Integer> {
    
}
