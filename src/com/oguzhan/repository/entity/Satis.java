package com.oguzhan.repository.entity;

import java.util.Date;

public class Satis {

    String urun;
    String musteri;
    int adet;
    double fiyat;
    double toplamFiyat;
    Date satisTarihi;
    Date islemTarihi;

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public String getMusteri() {
        return musteri;
    }

    public void setMusteri(String musteri) {
        this.musteri = musteri;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet, String username) {
        if(username.equals("Admin"))
        this.adet = adet;
        else
            System.out.println("giremezsin.");
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }

    public Date getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(Date satisTarihi) {
        this.satisTarihi = satisTarihi;
    }

    public Date getIslemTarihi() {
        return islemTarihi;
    }

    public void setIslemTarihi(Date islemTarihi) {
        this.islemTarihi = islemTarihi;
    }
}
