package com.proyecto.microserviciocultura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CulturaController {

    @GetMapping("/cultura")
    public String mostrarCasaCultura() {
        return "casa-cultura";
    }
}