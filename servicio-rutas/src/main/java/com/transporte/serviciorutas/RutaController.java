package com.transporte.serviciorutas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutaController {

    @GetMapping("/rutas")
    public String obtenerRutas() {
        return "Listado de Rutas";
    }
}
