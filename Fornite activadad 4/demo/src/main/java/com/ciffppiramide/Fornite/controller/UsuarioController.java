package com.ciffppiramide.Fornite.controller;
import com.ciffppiramide.Fornite.clases.Usuario;
import com.ciffppiramide.Fornite.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;



@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/crear_usuario")
    public String crear_usuario(Model model){
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "crear_usuario";
    }

    @PostMapping("/guardar_usuario")
    public String post_usuario(@ModelAttribute Usuario usuario, Model model){
        usuarioRepository.save(usuario);
        return "guardar_usuario";
    }

    @GetMapping("/Mostrar_usuarios")
    public String Mostrar_usuarios(Model model){
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "Mostrar_usuarios";
    }
}

