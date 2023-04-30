package com.hcmute.edu.vn.WebTBDT.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity(name="cart")
@Data
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int totalPrice;
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    private List<CartDetailEntity>cartDetailEntityList;
    @ManyToOne
    private CustomerEntity customer;
}
