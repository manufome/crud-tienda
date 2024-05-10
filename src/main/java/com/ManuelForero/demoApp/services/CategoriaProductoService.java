package com.ManuelForero.demoApp.services;

import com.ManuelForero.demoApp.entities.CategoriaProducto;
import com.ManuelForero.demoApp.repositories.CategoriaProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaProductoService {
    @Autowired
    private CategoriaProductoRepository categoriaProductoRepository;
   public List<CategoriaProducto> getAllCategorias() {
        return categoriaProductoRepository.findAll();
    }
    public CategoriaProducto getCategoriaById(Long id) {
        return categoriaProductoRepository.findById(id).orElse(null);
    }
    public CategoriaProducto createCategoria(CategoriaProducto categoriaProducto) {
        return categoriaProductoRepository.save(categoriaProducto);
    }
    public CategoriaProducto updateCategoria(CategoriaProducto categoriaProducto) {
        return categoriaProductoRepository.save(categoriaProducto);
    }
    public void deleteCategoria(Long id) {
        categoriaProductoRepository.deleteById(id);
    }
}