package com.ManuelForero.demoApp.repositories;

import com.ManuelForero.demoApp.entities.OrdenItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenItemRepository extends JpaRepository<OrdenItem, Long> {
}
