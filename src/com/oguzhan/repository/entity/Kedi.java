package com.oguzhan.repository.entity;

public class Kedi {

    String tur;
    String cins;
    int uzunluk;
    int agırlık;
    String tuyRengi;


    public Kedi(String tur, String cins, int uzunluk, int agırlık, String tuyRengi) {
        this.tur = tur;
        this.cins = cins;
        this.uzunluk = uzunluk;
        this.agırlık = agırlık;
        this.tuyRengi = tuyRengi;
    }

    @Override
    public String toString() {

        String result = "Kedi{" +
                "tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                ", uzunluk=" + uzunluk +
                ", agırlık=" + agırlık +
                ", tuyRengi='" + tuyRengi + '\'' +
                '}';
        System.out.println(result);
        return result;
    }

    /**
     * Constructor --> Yapıcı-Kurucu method
     * Default --> parametresiz.
     * 1- Sınıf adı ile aynı adı taşımalı
     * 2- Geri dönüş tipi yazılmamalı. çünkü sınıfın kendisi döner.
     * @return
     */


    public Kedi(int uzunluk,int agırlık){
        // this --> bu sınıf demektir.
        this.agırlık = agırlık;
        this.uzunluk = uzunluk;
    }
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
