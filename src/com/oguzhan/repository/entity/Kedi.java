package com.oguzhan.repository.entity;

public class Kedi {

    String tur;
    String cins;
    int uzunluk;
    int agırlık;
    String tuyRengi;


    /**
     * Constructor --> Yapıcı-Kurucu method
     * @return
     */

    public Kedi(){
        tur = "Siyah";
        agırlık = 200;
    }
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getAgırlık() {
        return agırlık;
    }

    public void setAgırlık(int agırlık) {
        this.agırlık = agırlık;
    }

    public String getTuyRengi() {
        return tuyRengi;
    }

    public void setTuyRengi(String tuyRengi) {
        this.tuyRengi = tuyRengi;
    }
}
