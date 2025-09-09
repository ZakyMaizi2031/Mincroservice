package com.zaky.orderservice.vo;

public class Pelanggan {
    private Long id;
    private String kode;
    private String nama;
    private Double alamat;

    public Pelanggan() {

    }

    public Pelanggan(Long id, String kode, String nama, Double alamat) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
    }

    public Long getId() {
        return id;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public Double getAlamat() {
        return alamat;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(Double alamat) {
        this.alamat = alamat;
    }

}
