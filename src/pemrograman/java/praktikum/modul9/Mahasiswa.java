/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 1, 2018 1:29:10 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul9;

/**
 *
 * @author od3ng
 */
public class Mahasiswa {

    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) throws GakBolehKosong {//ganti dengan exception buatan
        if (nim == null) {
            throw new GakBolehKosong("Nim harus diisi!");
        }
        this.nim = nim;
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
//        try {
//            m.setNim(null);
//        } catch (Throwable e) {
//            System.out.println("Ups, terjadi error");
//            System.out.println("" + e.getMessage());
//        }
//        block finnaly
//        try {
//            m.setNim("075410099");
////            m.setNim(null);
//        } catch (Throwable e) {
//            System.out.println("Ups, terjadi error");
//            System.out.println("" + e.getMessage());
//        } finally{
//            System.out.println("Pasti dijalankan!");
//        }
//        exception bentukan
        try {
            m.setNim(null);
        } catch (GakBolehKosong e) {
            System.out.println("Ups, terjadi error");
            System.out.println("" + e.getMessage());
        } finally {
            System.out.println("Pasti dijalankan!");
        }

    }

}
