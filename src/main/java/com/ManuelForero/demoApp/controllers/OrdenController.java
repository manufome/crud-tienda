package com.ManuelForero.demoApp.controllers;

import com.ManuelForero.demoApp.entities.Orden;
import com.ManuelForero.demoApp.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {
    @Autowired
    private OrdenService ordenService;
    @GetMapping
    public ResponseEntity<List<Orden>> getAllOrdenes() {
        return ResponseEntity.ok(ordenService.getAllOrdenes());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Orden> getOrdenById(@PathVariable Long id) {
        return ResponseEntity.ok(ordenService.getOrdenById(id));
    }
    @PostMapping
    public ResponseEntity<Orden> createOrden(Orden orden) {
        return ResponseEntity.ok(ordenService.createOrden(orden));
    }
    @PutMapping
    public ResponseEntity<Orden> updateOrden(Orden orden) {
        return ResponseEntity.ok(ordenService.updateOrden(orden));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrden(@PathVariable Long id) {
        ordenService.deleteOrden(id);
        return ResponseEntity.ok().build();
    }
}
