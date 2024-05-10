package com.ManuelForero.demoApp.controllers;

import com.ManuelForero.demoApp.entities.OrdenItem;
import com.ManuelForero.demoApp.services.OrdenItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordenItem")
public class OrdenItemController {
    @Autowired
    private OrdenItemService ordenItemService;

    @GetMapping
    public ResponseEntity<List<OrdenItem>> getAllOrdenItems() {
        return ResponseEntity.ok(ordenItemService.getAllOrdenItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdenItem> getOrdenItemById(@PathVariable Long id) {
        return ResponseEntity.ok(ordenItemService.getOrdenItemById(id));
    }

    @PostMapping
    public ResponseEntity<OrdenItem> createOrdenItem(@RequestBody OrdenItem ordenItem) {
        return ResponseEntity.ok(ordenItemService.createOrdenItem(ordenItem));
    }

    @PutMapping
    public ResponseEntity<OrdenItem> updateOrdenItem(@RequestBody OrdenItem ordenItem) {
        return ResponseEntity.ok(ordenItemService.updateOrdenItem(ordenItem));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrdenItem(@PathVariable Long id) {
        ordenItemService.deleteOrdenItem(id);
        return ResponseEntity.ok().build();
    }
}
