package com.zaky.peminjaman.vo;

public class Buku {
    private Long id;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun_terbit;

    

    public Buku(Long id, String judul, String pengarang, String penerbit, String tahun_terbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun_terbit = tahun_terbit;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public void setJudul(String judul) {
        this.judul = judul;
    }



    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }



    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public void setTahun(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public Long getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTahun() {
        return tahun_terbit;
    }
}
