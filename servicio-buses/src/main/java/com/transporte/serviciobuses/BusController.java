package com.transporte.serviciobuses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusController {

    @GetMapping("/buses")
    public String obtenerBuses() {
        return "Listado de Buses";
    }
}
