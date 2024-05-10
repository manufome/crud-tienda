package com.ManuelForero.demoApp.repositories;

import com.ManuelForero.demoApp.entities.CategoriaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaProductoRepository extends JpaRepository<CategoriaProducto, Long> {
}
