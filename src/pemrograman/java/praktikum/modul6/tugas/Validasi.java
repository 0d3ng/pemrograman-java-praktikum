/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Oct 26, 2018 11:24:16 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul6.tugas;

/**
 *
 * @author od3ng
 */
public class Validasi {

    public static boolean CekNama(String nama) {
        if (nama.length() < 6) {
            System.out.println("Panjang nama minimal harus 6");
            return false;
        } else if (!nama.matches("[a-z A-Z]+")) {
            System.out.println("Nama tidak boleh mengandung angka atau symbol");
            return false;
        }
        return true;
    }

    public static boolean CekAlamat(String alamat) {
        if (alamat.trim().length() == 0) {
            System.out.println("Alamat tidak boleh kosong!");
            return false;
        } else if (!alamat.matches("[a-z A-Z0-9]+")) {
            System.out.println("Alamat tidak boleh mengandung symbol");
            return false;
        }
        return true;
    }

    public static boolean CekTelf(String telf) {
        if (telf.trim().length() == 0) {
            System.out.println("Telf tidak boleh kosong!");
            return false;
        } else if (telf.trim().length() < 8) {
            System.out.println("Panjang nomor telf tidak sesuai");
            return false;
        } else if (!telf.matches("[0-9]+")) {
            System.out.println("Telf harus angka");
            return false;
        }
        return true;
    }

    public static boolean CekEmail(String email) {
        if (email.trim().length() == 0) {
            System.out.println("Email tidak boleh kosong!");
            return false;
        } else if (!email.matches("^(.+)@(.+)$")) {
            System.out.println("Format email tidak sesuai!");
            return false;
        }
        return true;
    }
}
