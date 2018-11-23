/*
 * Copyright (c) 2018
 * All rights reserved.
 * Written by nopri <lepengdados@gmail.com>, 29/09/2018
 */
package pemrograman.java.praktikum;

import pemrograman.java.praktikum.modul5.Modul5;
import pemrograman.java.praktikum.modul8.Pegawai;
import pemrograman.java.praktikum.modul8.overriding.Bayi;
import pemrograman.java.praktikum.modul8.overriding.Dewasa;
import pemrograman.java.praktikum.modul8.polimorfisme.Anjing;
import pemrograman.java.praktikum.modul8.polimorfisme.Hewan;
import pemrograman.java.praktikum.modul8.polimorfisme.Kambing;
import pemrograman.java.praktikum.modul8.polimorfisme.Kucing;

/**
 *
 * @author nopri
 */
public class PemrogramanJavaPraktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Tugas.tugas1();
//        Tugas.tugas2();
//Modul 5
//=======================
//        Modul5.contoh1();
//        Modul5.contoh2();
//        Modul5.contoh3();
//        Modul5.contoh4();
//        Modul5.contoh5();
//        Modul5.matrikIdentitas();
//        Modul5.calculateSubMatriks();

//modul 8
//========================================
//        Pegawai p = new Pegawai();
//        p.setNip("1234");
//        p.setNama("Noprianto");
//        p.setAlamat("Jogja");
//        System.out.println("" + p.getNip());
//        System.out.println("" + p.getNama());
//        System.out.println("" + p.getAlamat());

//        Bayi b = new Bayi();
//        b.lari();
//        Dewasa d = new Dewasa();
//        d.lari();

        Hewan hewan = new Anjing();
        hewan.bicara();
        hewan = new Kambing();
        hewan.bicara();
        hewan = new Kucing();
        hewan.bicara();
    }

}
