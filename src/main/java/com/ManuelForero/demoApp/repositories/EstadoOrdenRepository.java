package com.ManuelForero.demoApp.repositories;

import com.ManuelForero.demoApp.entities.EstadoOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoOrdenRepository extends JpaRepository<EstadoOrden, Long> {
}
