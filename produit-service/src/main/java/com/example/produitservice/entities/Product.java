package com.example.produitservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Product {
    @Id
    private String id ;
    @NonNull
    private String name ;
    @NonNull
    private String description;
    @NonNull
    private double price;
    @NonNull
    private String category;
}

