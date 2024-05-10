package com.ManuelForero.demoApp.repositories;

import com.ManuelForero.demoApp.entities.DetalleProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleProductoRepository extends JpaRepository<DetalleProducto, Long> {
}
