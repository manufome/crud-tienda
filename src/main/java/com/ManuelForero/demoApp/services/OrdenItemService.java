package com.ManuelForero.demoApp.services;

import com.ManuelForero.demoApp.entities.OrdenItem;
import com.ManuelForero.demoApp.repositories.OrdenItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenItemService {

    @Autowired
    private OrdenItemRepository ordenItemRepository;

    public List<OrdenItem> getAllOrdenItems() {
        return ordenItemRepository.findAll();
    }

    public OrdenItem getOrdenItemById(Long id) {
        return ordenItemRepository.findById(id).orElse(null);
    }

    public OrdenItem createOrdenItem(OrdenItem ordenItem) {
        return ordenItemRepository.save(ordenItem);
    }

    public OrdenItem updateOrdenItem(OrdenItem ordenItem) {
        return ordenItemRepository.save(ordenItem);
    }

    public void deleteOrdenItem(Long id) {
        ordenItemRepository.deleteById(id);
    }
}
