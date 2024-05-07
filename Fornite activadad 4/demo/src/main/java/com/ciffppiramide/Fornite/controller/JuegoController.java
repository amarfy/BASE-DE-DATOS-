package com.ciffppiramide.Fornite.controller;

import com.ciffppiramide.Fornite.clases.Idioma;
import com.ciffppiramide.Fornite.clases.Juego;
import com.ciffppiramide.Fornite.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JuegoController {
    @Autowired
    private JuegoRepository juegoRepository;

    @GetMapping("/crear_Juego")
    public String crear_Juego(Model model){
        Juego juego = new Juego();
        model.addAttribute("juego", juego);
        return "Crear_Juego";
    }

    @PostMapping("/Guardar_juego")
    public String post_juego(@ModelAttribute Juego juego, Model model){
        juegoRepository.save(juego);
        return "Guardar_juego";
    }

    @GetMapping("/Mostrar_lista")
    public String Mostrar_lista(Model model){
        Juego juego = new Juego();
        List<Juego> juegos = juegoRepository.findAll();
        model.addAttribute("juegos", juegos);
        return "Mostrar_lista";



    }
}