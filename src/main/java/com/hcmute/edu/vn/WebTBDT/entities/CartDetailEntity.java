package com.hcmute.edu.vn.WebTBDT.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity(name = "cart_detail")
@Data
public class CartDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    private int price;
    @ManyToOne
    private ProductEntity product;
    @ManyToOne
    private CartEntity cart;
}
