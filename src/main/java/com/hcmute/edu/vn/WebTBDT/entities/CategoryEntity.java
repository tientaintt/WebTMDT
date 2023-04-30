package com.hcmute.edu.vn.WebTBDT.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity(name="category")
@Data
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int active;
    @OneToMany(mappedBy = "category")
    private List<ProductEntity> productEntities;
}
