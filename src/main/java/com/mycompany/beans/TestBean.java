package com.mycompany.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Eine normale Javabean (Referenz JPA/Spring Data)
 * 
 * @author mbr
 */
@Entity // JPA Info: This is a database entity
public class TestBean implements Serializable { // Standard bean logic
    
    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO) // Datenbank macht Inkrementierung
    private Integer id; // EclipseLink benötigt immer Objekte. keine Datentypen (int)
   
    // Irgendein Parameter. Wir müssen ja mit was arbeiten...
    private String name;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
