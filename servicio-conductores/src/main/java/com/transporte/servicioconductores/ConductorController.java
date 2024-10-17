package com.transporte.servicioconductores.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConductorController {

    @GetMapping("/conductores")
    public String obtenerConductores() {
        return "Listado de Conductores";
    }
}
