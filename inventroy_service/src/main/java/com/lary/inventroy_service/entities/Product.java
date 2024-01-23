package com.lary.inventroy_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@NoArgsConstructor@AllArgsConstructor@Builder@Getter@Setter@ToString
public class Product {

    @Id
    private String id;
    private String name;
    private double prix;
    private int quantity;

}
