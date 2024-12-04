package com.example.commandeservice.dto;

import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class OrderMessage {

    private String id ;

    private String productId ;

    private int quantity ;

}
