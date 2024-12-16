package com.proyecto.microserviciocultura.controller;

import com.proyecto.microserviciocultura.model.EventoCultural;
import com.proyecto.microserviciocultura.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CulturaController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/cultura")
    public String mostrarCasaCultura(Model model) {
        return "casa-cultura";
    }

    @GetMapping("/cultura/eventos")
    @ResponseBody
    public List<EventoCultural> getEvents() {
        return eventoService.getEvents();
    }
}