package com.example.inventaireservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Inventory {
    @Id
    private String productId ;
    @NonNull
    private int quantity ;
    @NonNull
    private String warehouseLocation;

}
