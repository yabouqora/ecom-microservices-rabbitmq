package com.example.inventaireservice.repositories;

import com.example.inventaireservice.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
}
