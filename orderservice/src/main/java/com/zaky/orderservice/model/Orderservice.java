package com.zaky.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;
@Data
@Entity
public class Orderservice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long produkId;
    private long pelangganId;
    private int jumlah;
    private String tanggal;
    private String status;
    private Double total;
}
