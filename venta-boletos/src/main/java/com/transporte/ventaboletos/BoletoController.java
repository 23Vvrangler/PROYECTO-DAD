package com.transporte.servicioventaboletos.controller;

import com.transporte.servicioventaboletos.model.Boleto;
import com.transporte.servicioventaboletos.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/boletos")
public class BoletoController {

    private final BoletoService boletoService;

    @Autowired
    public BoletoController(BoletoService boletoService) {
        this.boletoService = boletoService;
    }

    // Endpoint para obtener todos los boletos
    @GetMapping
    public ResponseEntity<List<Boleto>> obtenerTodosLosBoletos() {
        List<Boleto> boletos = boletoService.obtenerTodosLosBoletos();
        return ResponseEntity.ok(boletos);
    }

    // Endpoint para obtener boletos por cliente
    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<Boleto>> obtenerBoletosPorCliente(@PathVariable Long clienteId) {
        List<Boleto> boletos = boletoService.obtenerBoletosPorCliente(clienteId);
        return ResponseEntity.ok(boletos);
    }

    // Endpoint para obtener boletos por fecha de emisión
    @GetMapping("/fecha-emision/{fechaEmision}")
    public ResponseEntity<List<Boleto>> obtenerBoletosPorFechaEmision(@PathVariable String fechaEmision) {
        LocalDate fecha = LocalDate.parse(fechaEmision);
        List<Boleto> boletos = boletoService.obtenerBoletosPorFechaEmision(fecha);
        return ResponseEntity.ok(boletos);
    }

    // Endpoint para obtener boletos por estado
    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<Boleto>> obtenerBoletosPorEstado(@PathVariable String estado) {
        List<Boleto> boletos = boletoService.obtenerBoletosPorEstado(estado);
        return ResponseEntity.ok(boletos);
    }

    // Endpoint para obtener boletos emitidos entre dos fechas
    @GetMapping("/entre-fechas")
    public ResponseEntity<List<Boleto>> obtenerBoletosEntreFechas(
            @RequestParam("fechaInicio") String fechaInicio,
            @RequestParam("fechaFin") String fechaFin) {
        LocalDate inicio = LocalDate.parse(fechaInicio);
        LocalDate fin = LocalDate.parse(fechaFin);
        List<Boleto> boletos = boletoService.obtenerBoletosEntreFechas(inicio, fin);
        return ResponseEntity.ok(boletos);
    }

    // Endpoint para obtener boletos por bus
    @GetMapping("/bus/{busId}")
    public ResponseEntity<List<Boleto>> obtenerBoletosPorBus(@PathVariable Long busId) {
        List<Boleto> boletos = boletoService.obtenerBoletosPorBus(busId);
        return ResponseEntity.ok(boletos);
    }

    // Endpoint para contar boletos vendidos por bus y fecha de emisión
    @GetMapping("/bus/{busId}/fecha-emision/{fechaEmision}")
    public ResponseEntity<Long> contarBoletosPorBusYFecha(
            @PathVariable Long busId,
            @PathVariable String fechaEmision) {
        LocalDate fecha = LocalDate.parse(fechaEmision);
        Long cantidad = boletoService.contarBoletosPorBusYFecha(busId, fecha);
        return ResponseEntity.ok(cantidad);
    }

    // Endpoint para obtener boletos de un cliente entre dos fechas
    @GetMapping("/cliente/{clienteId}/entre-fechas")
    public ResponseEntity<List<Boleto>> obtenerBoletosPorClienteYFechas(
            @PathVariable Long clienteId,
            @RequestParam("fechaInicio") String fechaInicio,
            @RequestParam("fechaFin") String fechaFin) {
        LocalDate inicio = LocalDate.parse(fechaInicio);
        LocalDate fin = LocalDate.parse(fechaFin);
        List<Boleto> boletos = boletoService.obtenerBoletosPorClienteYFechas(clienteId, inicio, fin);
        return ResponseEntity.ok(boletos);
    }

    // Endpoint para obtener un boleto por ID
    @GetMapping("/{id}")
    public ResponseEntity<Boleto> obtenerBoletoPorId(@PathVariable Long id) {
        Optional<Boleto> boleto = boletoService.obtenerBoletoPorId(id);
        return boleto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint para guardar un nuevo boleto
    @PostMapping
    public ResponseEntity<Boleto> guardarBoleto(@RequestBody Boleto boleto) {
        Boleto nuevoBoleto = boletoService.guardarBoleto(boleto);
        return ResponseEntity.ok(nuevoBoleto);
    }

    // Endpoint para eliminar un boleto por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBoleto(@PathVariable Long id) {
        boletoService.eliminarBoleto(id);
        return ResponseEntity.noContent().build();
    }
}
