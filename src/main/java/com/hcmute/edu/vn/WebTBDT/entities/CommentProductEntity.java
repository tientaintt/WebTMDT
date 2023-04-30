package com.hcmute.edu.vn.WebTBDT.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Table
@Entity(name="comment_product")
@Data
public class CommentProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private Date commentdate=new Date(new java.util.Date().getTime());;
    private Date modifydate;
    @ManyToOne
    private CustomerEntity customer;
    @ManyToOne
    private ProductEntity product;

}
