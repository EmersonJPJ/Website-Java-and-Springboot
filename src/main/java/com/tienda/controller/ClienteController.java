package com.tienda.controller;

import com.tienda.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
/** 
 * @author emers
 */

@Controller
public class ClienteController {
    
    @GetMapping("/")
    public String inicio(Model model){
        var saludo="Saludos desde el Back End";
        model.addAttribute("mensaje",saludo);
        
        Cliente cliente=new Cliente("Juan","Contreras","jcontreras@gmail.com","25289424");
        Cliente cliente2=new Cliente("Raul","Contreras","rcontreras@gmail.com","29489974");
        Cliente cliente3=new Cliente("Marta","Contreras","mcontreras@gmail.com","25277974");
        
        var clientes=Arrays.asList(cliente,cliente2,cliente3);
        
        model.addAttribute("clientes", clientes);
        
        
        return "index";
    }
            
}
