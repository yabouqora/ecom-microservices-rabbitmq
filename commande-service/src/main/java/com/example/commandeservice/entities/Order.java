package com.example.commandeservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Order {
    @Id
    private String id ;
    @NonNull
    private String productId ;
    @NonNull
    private int quantity ;
    @NonNull
    private String status;
    @NonNull
    private BigDecimal totalAmount;
    @NonNull
    private LocalDateTime orderDate;

}
