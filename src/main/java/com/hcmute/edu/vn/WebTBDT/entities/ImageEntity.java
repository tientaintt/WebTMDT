package com.hcmute.edu.vn.WebTBDT.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity(name="image")
@Data
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String urlImage;
    @ManyToOne
    private ProductEntity product;
}
