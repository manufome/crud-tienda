package com.ManuelForero.demoApp.controllers;

import com.ManuelForero.demoApp.entities.CategoriaProducto;
import com.ManuelForero.demoApp.services.CategoriaProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaProductoController {

    @Autowired
    private CategoriaProductoService categoriaProductoService;

    @GetMapping
    public ResponseEntity<List<CategoriaProducto>> getAllCategorias() {
        return ResponseEntity.ok(categoriaProductoService.getAllCategorias());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaProducto> getCategoriaById(@PathVariable Long id) {
        return ResponseEntity.ok(categoriaProductoService.getCategoriaById(id));
    }

    @PostMapping
    public ResponseEntity<CategoriaProducto> createCategoria(@RequestBody CategoriaProducto categoriaProducto) {
        return ResponseEntity.ok(categoriaProductoService.createCategoria(categoriaProducto));
    }

    @PutMapping
    public ResponseEntity<CategoriaProducto> updateCategoria(@RequestBody CategoriaProducto categoriaProducto) {
        return ResponseEntity.ok(categoriaProductoService.updateCategoria(categoriaProducto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Long id) {
        categoriaProductoService.deleteCategoria(id);
        return ResponseEntity.ok().build();
    }
}