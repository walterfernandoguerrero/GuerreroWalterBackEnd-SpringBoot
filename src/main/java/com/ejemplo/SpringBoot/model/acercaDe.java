
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
public class acercaDe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String desc1;
    private String desc2;
    private String desc3;
    private String desc4;
    private String desc5;

    public acercaDe() {
    }

    public acercaDe(int id, String desc1, String desc2, String desc3, String desc4, String desc5) {
        this.id = id;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.desc3 = desc3;
        this.desc4 = desc4;
        this.desc5 = desc5;
    }
    
    
      
}
