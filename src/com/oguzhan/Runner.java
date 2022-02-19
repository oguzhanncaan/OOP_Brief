package com.oguzhan;

import com.oguzhan.repository.entity.Kedi;
import com.oguzhan.repository.entity.Mudur;
import com.oguzhan.repository.entity.Satis;
import com.oguzhan.repository.entity.Urun;

public class Runner {
    public static void main(String[] args) {
        /**
         * İlk olarak nesne türetilir.
         */
        Urun urun = new Urun();
        /**
         * Bir nesne içindeki bilgilerin erişime açılması onun erişim belirteçlerinin düzeyi ile ilgilidir.
         * ACCESS MODIFIERS
         */
        urun.ad = "ASUS";

        Satis satis = new Satis();
        satis.setAdet(400, "Admin");
        satis.getAdet();
        System.out.println(satis.getAdet());

        Mudur mudur = new Mudur();
        mudur.setDogumYili(1990);

        Kedi kedi = new Kedi();
        System.out.println("Kedi ağırlığı: " +kedi.getAgırlık());
        System.out.println("Kedi türü : " +kedi.getTur());

        Kedi kedi1 = new Kedi("tür","cins", 5, 120,"sarı");

        kedi1.toString();



    }
}
