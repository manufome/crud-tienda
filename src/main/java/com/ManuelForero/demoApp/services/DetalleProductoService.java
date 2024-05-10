package com.ManuelForero.demoApp.services;

import com.ManuelForero.demoApp.entities.DetalleProducto;
import com.ManuelForero.demoApp.repositories.DetalleProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleProductoService {

    @Autowired
    private DetalleProductoRepository detalleProductoRepository;

    public List<DetalleProducto> getAllDetalleProductos() {
        return detalleProductoRepository.findAll();
    }
    public DetalleProducto getDetalleProductoById(Long id) {
        return detalleProductoRepository.findById(id).orElse(null);
    }
    public DetalleProducto createDetalleProducto(DetalleProducto detalleProducto) {
        return detalleProductoRepository.save(detalleProducto);
    }
    public DetalleProducto updateDetalleProducto(DetalleProducto detalleProducto) {
        return detalleProductoRepository.save(detalleProducto);
    }
    public void deleteDetalleProducto(Long id) {
        detalleProductoRepository.deleteById(id);
    }
}
