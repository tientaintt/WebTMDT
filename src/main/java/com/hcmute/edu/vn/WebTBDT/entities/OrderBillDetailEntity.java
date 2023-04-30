package com.hcmute.edu.vn.WebTBDT.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity(name="order_bill_detail")
@Data
public class OrderBillDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    private int available;
    @ManyToOne
    private ProductEntity product;
    @ManyToOne
    private OrderBillEntity orderBill;
}
