/*
 * Copyright (c) 2018
 * All rights reserved.
 * Written by nopri <lepengdados@gmail.com>, 29/09/2018
 */
package pemrograman.java.praktikum;

import pemrograman.java.praktikum.modul8.Pegawai;
import pemrograman.java.praktikum.modul8.interfacevsabstract.BangunDatarInterface;
import pemrograman.java.praktikum.modul8.interfacevsabstract.Lingkaran;
import pemrograman.java.praktikum.modul8.interfacevsabstract.PersegiPanjang;

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
//        Pegawai p = new Pegawai("Noprianto","Yogyakarta","1234");
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
//        Hewan hewan = new Anjing();
//        hewan.bicara();
//        hewan = new Kambing();
//        hewan.bicara();
//        hewan = new Kucing();
//        hewan.bicara();
//        PersegiPanjang pp = new PersegiPanjang(2, 3);
//        System.out.println("luas    : " + pp.luas());
//        System.out.println("keliling: " + pp.keliling());
//        Lingkaran lingkaran = new Lingkaran();
//        System.out.println("luas    : "+lingkaran.luas(14));
//        System.out.println("keliling: "+lingkaran.keliling(14));
        BangunDatarInterface datarInterface = new Lingkaran();
        System.out.println("luas: "+datarInterface.luas(10));
    }

}
