package com.transporte.serviciohorarios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HorarioController {

    @GetMapping("/horarios")
    public String obtenerHorarios() {
        return "Listado de Horarios";
    }
}
