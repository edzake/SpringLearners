package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Beispiel Controller mit einem Request
 *
 * @author mbr
 */
@Controller
@RequestMapping("/idx")
public class IndexController {

    /**
     * Eine Methode mit dem Viewmodel.
     * Hierbei ist es wichtig zu akzeptieren, dass das Model
     * von Spring einfach injected wird. Dies kann man für verschiedene
     * Elemente (z.B. HttpRequest, HttpResponse) tun
     * 
     * z.B. http://localhost:8080/s/idx/start
     * @param md
     * @return 
     */
    @RequestMapping("/start")
    public String start(Model md) {
        // Um das ViewModel zu nutzen, schreiben wir 
        // Pferd in das Model 
        md.addAttribute("name", "PFERD");
        return "/ausgabe"; // TO TEH VIEW /o/
    }
    
    /**
     * Beispiel mit irgendeinam Parameter. Diese Methode geht nicht zu
     * einer View, sondern stellt die übergebene id einfach dar.
     * 
     * z.B. http://localhost:8080/s/idx/create?id=BLAFASEL
     * @param id
     * @return 
     */
    @RequestMapping("create")
    @ResponseBody
    public String create(@RequestParam String id) {
        return id;
    }
    
}
