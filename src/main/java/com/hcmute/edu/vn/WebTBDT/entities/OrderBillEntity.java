package com.hcmute.edu.vn.WebTBDT.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Table
@Entity(name="oder_bill")
@Data
public class OrderBillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int available;
    private int totalPrice;
    private Date orderDate=new Date(new java.util.Date().getTime());
    @OneToMany(mappedBy = "orderBill")
    private List<OrderBillDetailEntity>orderBillDetailEntityList;
    @ManyToOne
    private CustomerEntity customer;
}
