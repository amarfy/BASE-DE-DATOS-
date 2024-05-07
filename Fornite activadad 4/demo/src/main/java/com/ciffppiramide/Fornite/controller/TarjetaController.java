package com.ciffppiramide.Fornite.controller;

import com.ciffppiramide.Fornite.clases.Tarjeta_Credito;
import com.ciffppiramide.Fornite.clases.Usuario;
import com.ciffppiramide.Fornite.repository.TarjetaRepository;
import com.ciffppiramide.Fornite.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class TarjetaController {
    @Autowired
    private TarjetaRepository tarjetaRepository;

    @GetMapping("/tarjeta_Credito")
    public String tarjeta_Credito(Model model){
        Tarjeta_Credito tarjetaCredito = new Tarjeta_Credito();
        model.addAttribute("tarjeta", tarjetaCredito);
        return "tarjeta_Credito";
    }

    @PostMapping("/guardar_tarjeta")
    public String post_usuario(@ModelAttribute Tarjeta_Credito tarjetaCredito, Model model){
        tarjetaRepository.save(tarjetaCredito);
        return "guardar_tarjeta";
    }

    @GetMapping("/Mostrar_tarjeta")
    public String Mostrar_tarjeta(Model model){
        return "Mostrar_usuarios";
    }
}



