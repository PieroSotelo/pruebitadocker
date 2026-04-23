package com.proyecto.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/datos")
public class DatosController {

    @GetMapping
    public String obtenerDatos() {
        return "Backend funcionando correctamente";
    }
}
