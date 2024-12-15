package com.proyecto.microserviciocultura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cultura")
public class CulturaController {

    @GetMapping
    public String obtenerCultura() {
        // Lógica para obtener información de cultura
        return "Información de cultura";
    }

    @PostMapping
    public String crearCultura(@RequestBody String nuevaCultura) {
        // Lógica para crear nueva información de cultura
        return "Nueva cultura creada";
    }
}