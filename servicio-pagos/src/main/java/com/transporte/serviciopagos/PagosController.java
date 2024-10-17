package com.transporte.serviciopagos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagosController {

    @GetMapping("/pagos")
    public String obtenerPagos() {
        return "Listado de Pagos";
    }
}
