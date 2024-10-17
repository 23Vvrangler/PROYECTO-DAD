package com.transporte.servicioventaboletos.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity  // Esto indica que la clase será mapeada a una tabla
@Table(name = "boletos")  // nombre de la tabla
public class Boleto {

    @Id  // clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //  el ID será autogenerado
    private Long id;

    @Column(nullable = false)  //  este campo es obligatorio (NOT NULL)
    private String numeroBoleto;

    @Column(nullable = false)
    private Double precio;

    @Column(nullable = false)
    private LocalDateTime fechaCompra;

    @Column(nullable = false)
    private String cliente;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNumeroBoleto() { return numeroBoleto; }
    public void setNumeroBoleto(String numeroBoleto) { this.numeroBoleto = numeroBoleto; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public LocalDateTime getFechaCompra() { return fechaCompra; }
    public void setFechaCompra(LocalDateTime fechaCompra) { this.fechaCompra = fechaCompra; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
}
