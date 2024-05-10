package com.ManuelForero.demoApp.services;

import com.ManuelForero.demoApp.entities.Orden;
import com.ManuelForero.demoApp.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepository ordenRepository;

    public List<Orden> getAllOrdenes() {
        return ordenRepository.findAll();
    }

    public Orden getOrdenById(Long id) {
        return ordenRepository.findById(id).orElse(null);
    }

    public Orden createOrden(Orden orden) {
        return ordenRepository.save(orden);
    }

    public Orden updateOrden(Orden orden) {
        return ordenRepository.save(orden);
    }

    public void deleteOrden(Long id) {
        ordenRepository.deleteById(id);
    }
}
