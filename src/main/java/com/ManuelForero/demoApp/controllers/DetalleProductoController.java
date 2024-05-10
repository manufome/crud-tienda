package com.ManuelForero.demoApp.controllers;

import com.ManuelForero.demoApp.entities.DetalleProducto;
import com.ManuelForero.demoApp.services.DetalleProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle-productos")
public class DetalleProductoController {

    @Autowired
    private DetalleProductoService detalleProductoService;

    @GetMapping
    public ResponseEntity<List<DetalleProducto>> getAllDetalleProductos() {
        return ResponseEntity.ok(detalleProductoService.getAllDetalleProductos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleProducto> getDetalleProductoById(@PathVariable Long id) {
        return ResponseEntity.ok(detalleProductoService.getDetalleProductoById(id));
    }
    @PostMapping
    public ResponseEntity<DetalleProducto> createDetalleProducto(DetalleProducto detalleProducto) {
        return ResponseEntity.ok(detalleProductoService.createDetalleProducto(detalleProducto));
    }
    @PutMapping
    public ResponseEntity<DetalleProducto> updateDetalleProducto(DetalleProducto detalleProducto) {
        return ResponseEntity.ok(detalleProductoService.updateDetalleProducto(detalleProducto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetalleProducto(@PathVariable Long id) {
        detalleProductoService.deleteDetalleProducto(id);
        return ResponseEntity.ok().build();
    }
}
