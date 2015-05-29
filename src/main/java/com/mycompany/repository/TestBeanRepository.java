/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.beans.TestBean;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Beispiel ist eine Datenbankschnittstellen ,die generelle CRUD bereitstellt.
 * @author mbr
 */
public interface TestBeanRepository extends CrudRepository<TestBean, Serializable> {
    
    
    // Synonnym für select * from Tabelle where name = ?
    List<TestBean> findOneByName(String name);
    
}
