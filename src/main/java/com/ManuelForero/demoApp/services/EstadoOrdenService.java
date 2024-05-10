package com.ManuelForero.demoApp.services;

import com.ManuelForero.demoApp.entities.EstadoOrden;
import com.ManuelForero.demoApp.repositories.EstadoOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoOrdenService {
    @Autowired
    private EstadoOrdenRepository estadoOrdenRepository;

    public List<EstadoOrden> getAllEstadosOrden() {
        return estadoOrdenRepository.findAll();
    }

    public EstadoOrden getEstadoOrdenById(Long id) {
        return estadoOrdenRepository.findById(id).orElse(null);
    }

    public EstadoOrden createEstadoOrden(EstadoOrden estadoOrden) {
        return estadoOrdenRepository.save(estadoOrden);
    }

    public EstadoOrden updateEstadoOrden(EstadoOrden estadoOrden) {
        return estadoOrdenRepository.save(estadoOrden);
    }

    public void deleteEstadoOrden(Long id) {
        estadoOrdenRepository.deleteById(id);
    }
}
