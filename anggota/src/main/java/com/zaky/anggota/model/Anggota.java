package com.zaky.anggota.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;
@Data
@Entity
public class Anggota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nim;
    private String nama;
    private String email;
    private String alamat;
    private String jeniskelamin;
}
