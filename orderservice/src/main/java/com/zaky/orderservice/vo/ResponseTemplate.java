package com.zaky.orderservice.vo;

import com.zaky.orderservice.model.Orderservice;

public class ResponseTemplate {
    Orderservice order;
    Pelanggan pelanggan;
    Produk produk;

    public ResponseTemplate() {

    }

    public ResponseTemplate(Orderservice order, Pelanggan pelanggan, Produk produk) {
        this.order = order;
        this.pelanggan = pelanggan;
        this.produk = produk;
    }

    public Orderservice getOrder() {
        return order;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setOrder(Orderservice order) {
        this.order = order;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

   
}
