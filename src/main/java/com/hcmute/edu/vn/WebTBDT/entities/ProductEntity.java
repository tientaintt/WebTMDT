package com.hcmute.edu.vn.WebTBDT.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Table
@Entity(name="product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int available;
    private int quantity;
    private int price;
    private String description;
    @ManyToOne
    private CategoryEntity category;

    @OneToMany(mappedBy = "product")
    private List<ImageEntity>imagelist;
    @OneToMany(mappedBy = "product")
    private List<CartDetailEntity> cartDetailEntityList;
    @OneToMany(mappedBy = "product")
    private List<CommentProductEntity>commentProductEntityList;
    @OneToMany(mappedBy = "product")
    private List<OrderBillDetailEntity>orderBillDetailEntityList;

}
