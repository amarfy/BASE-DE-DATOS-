package com.ciffppiramide.Fornite.controller;
import com.ciffppiramide.Fornite.clases.Videojuegos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@Controller
public class MainControlador {

    @GetMapping("/index")
    public String index(Model model){

        Videojuegos videojuego1 = new Videojuegos("LEGO Fornite","87,7 mil","images/lego.jpg");
        Videojuegos videojuegos2 = new Videojuegos("Rocket Racing","10,7 mil","images/rocket.jpg");
        Videojuegos videojuegos3 = new Videojuegos("Escenario Pricipal de Festival","18,5 mil","images/festival.jpg");
        Videojuegos videojuegos4 = new Videojuegos("Escenario de improvisación","10,7 mil","images/impro.jpg");

        ArrayList<Videojuegos>videojuegos =new ArrayList<>();
        videojuegos.add(videojuego1);
        videojuegos.add(videojuegos2);
        videojuegos.add(videojuegos3);
        videojuegos.add(videojuegos4);

        model.addAttribute("videojuego",videojuegos);
        return "index";
}
}
