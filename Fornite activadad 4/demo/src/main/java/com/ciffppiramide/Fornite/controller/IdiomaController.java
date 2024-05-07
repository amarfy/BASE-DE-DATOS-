package com.ciffppiramide.Fornite.controller;

import com.ciffppiramide.Fornite.clases.Idioma;
import com.ciffppiramide.Fornite.repository.IdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IdiomaController {

    @Autowired
    private IdiomaRepository idiomaRepository;



    @GetMapping("/Crear_idiomas")
    public String Crear_idiomas(Model model){
        Idioma idioma = new Idioma();
        model.addAttribute("idioma", idioma);
        return "Crear_idiomas";

    }
    @PostMapping("/guardar_idioma")
    public String post_idioma(@ModelAttribute Idioma idioma, Model model){


        idiomaRepository.save(idioma);
        return "Guardar_idioma";

}
}
