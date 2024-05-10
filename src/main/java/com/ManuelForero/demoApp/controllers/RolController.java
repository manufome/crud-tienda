package com.ManuelForero.demoApp.controllers;

import com.ManuelForero.demoApp.entities.Rol;
import com.ManuelForero.demoApp.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public ResponseEntity<List<Rol>> getAllRoles() {
        return ResponseEntity.ok(rolService.getAllRoles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rol> getRolById(@PathVariable Long id) {
        return ResponseEntity.ok(rolService.getRolById(id));
    }

    @PostMapping
    public ResponseEntity<Rol> createRol(@RequestBody Rol rol) {
        return ResponseEntity.created(null).body(rolService.createRol(rol));
    }

    @PutMapping
    public ResponseEntity<Rol> updateRol(@RequestBody Rol rol) {
        return ResponseEntity.ok(rolService.updateRol(rol));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRol(@PathVariable Long id) {
        rolService.deleteRol(id);
        return ResponseEntity.ok().build();
    }

}
