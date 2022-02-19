package com.oguzhan.repository.entity;

public class Urun {
    public String ad;
    private String barkod;
    protected double fiyat;
    private int miktar;
    private int kdv;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }
}
/**
 * public --> tüm lokasyonlardan erişimi açık
 * private --> sadece sınıf içine açık.
 * protected --> sınıf ve paket içine açık.
 */