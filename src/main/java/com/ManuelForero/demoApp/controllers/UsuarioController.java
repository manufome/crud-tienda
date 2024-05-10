package com.ManuelForero.demoApp.controllers;

import com.ManuelForero.demoApp.entities.Usuario;
import com.ManuelForero.demoApp.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        return ResponseEntity.ok(usuarioService.getAllUsuarios());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.getUsuarioById(id));
    }
    @PostMapping
    public ResponseEntity<Usuario> createUsuario(Usuario usuario) {
        return ResponseEntity.ok(usuarioService.createUsuario(usuario));
    }
    @PutMapping
    public ResponseEntity<Usuario> updateUsuario(Usuario usuario) {
        return ResponseEntity.ok(usuarioService.updateUsuario(usuario));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
        return ResponseEntity.ok().build();
    }

}
