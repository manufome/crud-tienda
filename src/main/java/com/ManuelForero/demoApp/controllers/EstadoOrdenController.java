package com.ManuelForero.demoApp.controllers;

import com.ManuelForero.demoApp.entities.EstadoOrden;
import com.ManuelForero.demoApp.services.EstadoOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estado-orden")
public class EstadoOrdenController {

    @Autowired
    private EstadoOrdenService estadoOrdenService;

    @GetMapping
    public ResponseEntity<List<EstadoOrden>> getAllEstadoOrden() {
        return ResponseEntity.ok(estadoOrdenService.getAllEstadosOrden());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadoOrden> getEstadoOrdenById(@PathVariable Long id) {
        return ResponseEntity.ok(estadoOrdenService.getEstadoOrdenById(id));
    }

    @PostMapping
    public ResponseEntity<EstadoOrden> createEstadoOrden(EstadoOrden estadoOrden) {
        return ResponseEntity.ok(estadoOrdenService.createEstadoOrden(estadoOrden));
    }

    @PutMapping
    public ResponseEntity<EstadoOrden> updateEstadoOrden(EstadoOrden estadoOrden) {
        return ResponseEntity.ok(estadoOrdenService.updateEstadoOrden(estadoOrden));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstadoOrden(@PathVariable Long id) {
        estadoOrdenService.deleteEstadoOrden(id);
        return ResponseEntity.ok().build();
    }
}
