package com.transporte.serviciosoporte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoporteController {

    @GetMapping("/soporte")
    public String obtenerSoporte() {
        return "Listado de Soporte";
    }
}
