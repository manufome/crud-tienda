package com.ManuelForero.demoApp.services;

import com.ManuelForero.demoApp.entities.Rol;
import com.ManuelForero.demoApp.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {
    @Autowired
    private RolRepository rolRepository;

    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }

    public Rol getRolById(Long id) {
        return rolRepository.findById(id).orElse(null);
    }

    public Rol createRol(Rol rol) {
        return rolRepository.save(rol);
    }

    public Rol updateRol(Rol rol) {
        return rolRepository.save(rol);
    }

    public void deleteRol(Long id) {
        rolRepository.deleteById(id);
    }
}
