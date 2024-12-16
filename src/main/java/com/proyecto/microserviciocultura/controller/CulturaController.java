package com.proyecto.microserviciocultura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CulturaController {

    @GetMapping("/cultura")
    public String mostrarCasaCultura(Model model) {
        List<String> eventos = Arrays.asList("Concierto de Rock", "Taller de Pintura", "Feria del Libro", "Exposición de Arte");
        model.addAttribute("eventos", eventos);
        return "casa-cultura";
    }
}