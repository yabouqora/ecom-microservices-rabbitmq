package com.example.inventaireservice.controllers;

import com.example.inventaireservice.entities.Inventory;
import com.example.inventaireservice.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")

public class InventoryController {
    @Autowired
    private InventoryService inventoryService ;

    @GetMapping
    public List<Inventory> getAllInventory() {
        return inventoryService.getAllInventory() ;
    }

    @GetMapping("/{productId}")
    public Inventory getInventoryByProductId(@PathVariable String productId) {
        return inventoryService.getInventoryByProductId(productId) ;
    }

    @PutMapping("/{productId}")
    public Inventory updateInventory(@PathVariable String productId, @RequestParam int quantity) {
        return inventoryService.updateInventory(productId, quantity) ;
    }

}
