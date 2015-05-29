/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.converter;

import com.mycompany.beans.TestBean;
import com.mycompany.repository.TestBeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

/**
 *
 * @author mbr
 */
public class TestBeanConverter implements Converter<String, TestBean> {

    @Autowired
    private TestBeanRepository repo;

    /*    
     // Wir bekommen ein Teil der REquest URL und 
     // suchen dazu ein Objekt, was passen kann
     // Es ist ein String, weil es einfacher für Spring ist, die
     // Datenelemente zu vergeben
     */
    @Override
    public TestBean convert(String s) {
        // von nix, kommt nix
        if (s == null || s.isEmpty())
            return null;
        // Das folgende geht in der Regel, fängt aber nix ab
        return repo.findOne(Long.parseLong(s));
    }

}
