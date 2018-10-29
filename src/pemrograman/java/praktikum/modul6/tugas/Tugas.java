/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Oct 26, 2018 10:58:50 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul6.tugas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pemrograman.java.praktikum.modul6.BukuAlamat;

/**
 *
 * @author od3ng
 */
public class Tugas {

    List<BukuAlamat> bukuAlamats = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    OPERASI operasi;

    enum OPERASI {
        UPDATE, SIMPAN
    }

    void isiData(int index) {
        BukuAlamat ba = new BukuAlamat();
        boolean valid = false;
        while (!valid) {
            System.out.print("Nama      : ");
            String nama = s.next();
            if (Validasi.CekNama(nama)) {
                ba.setNama(nama);
                System.out.print("Alamat    : ");
                String alamat = s.next();
                if (Validasi.CekAlamat(alamat)) {
                    ba.setAlamat(alamat);
                    System.out.print("Telf      : ");
                    String telf = s.next();
                    if (Validasi.CekTelf(telf)) {
                        ba.setTelfon(telf);
                        System.out.print("Email     : ");
                        String email = s.next();
                        if (Validasi.CekEmail(email)) {
                            ba.setEmail(email);
                            valid = true;
                            if (operasi == OPERASI.SIMPAN) {
                                bukuAlamats.add(ba);
                            } else {
                                bukuAlamats.set(index, ba);
                            }
                        }
                    }

                }

            }
        }

    }

    void hapusData() {
        if (bukuAlamats.isEmpty()) {
            System.out.println("Buku alamat masih kosong!");
        } else {
            System.out.print("Masukan nama yang akan dihapus? ");
            String nama = s.next();
            int index = cariByNama(nama);
            if (index == -1) {
                System.out.println("Nama " + nama + " tidak ditemukan!");
            } else {
                System.out.print("Anda yakin akan menghapus " + nama + "?(y/n)");
                String answer = s.next();
                if (answer.equalsIgnoreCase("y")) {
                    bukuAlamats.remove(index);
                }
            }
        }
    }

    void tampilData() {
        if (bukuAlamats.isEmpty()) {
            System.out.println("Buku alamat masih kosong!");
        } else {
            int counter = 1;
            for (BukuAlamat bukuAlamat : bukuAlamats) {
                System.out.println("Data ke-" + counter);
                System.out.println("-------------------");
                System.out.println("Nama    :" + bukuAlamat.getNama());
                System.out.println("Alamat  :" + bukuAlamat.getAlamat());
                System.out.println("Telf    :" + bukuAlamat.getTelfon());
                System.out.println("Email   :" + bukuAlamat.getEmail());
                System.out.println("");
                counter++;
            }
        }

    }

    void updateData() {
        if (bukuAlamats.isEmpty()) {
            System.out.println("Buku alamat masih kosong!");
        } else {
            System.out.print("Masukan nama yang akan diupdate? ");
            String nama = s.next();
            int index = cariByNama(nama);
            if (index == -1) {
                System.out.println("Nama " + nama + " tidak ditemukan!");
            } else {
                System.out.print("Anda yakin akan mengupdate " + nama + "?(y/n)");
                String answer = s.next();
                if (answer.equalsIgnoreCase("y")) {
                    operasi = OPERASI.UPDATE;
                    isiData(index);
                }
            }
        }
    }

    int cariByNama(String nama) {
        for (int i = 0; i < bukuAlamats.size(); i++) {
            BukuAlamat ba = bukuAlamats.get(i);
            if (ba.getNama().equals(nama)) {
                return i;
            }
        }
        return -1;
    }

    public void tugas1() {
        int pil = 0;
        do {
            System.out.println("");
            System.out.println("Aplikasi buku alamat");
            System.out.println("====================");
            System.out.println("1. Masukan data");
            System.out.println("2. Menghapus data");
            System.out.println("3. Menampilkan data");
            System.out.println("4. Update data");
            System.out.println("5. Keluar");
            System.out.print("Pilih[1...5] ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    operasi = OPERASI.SIMPAN;
                    isiData(0);
                    break;
                case 2:
                    hapusData();
                    break;
                case 3:
                    tampilData();
                    break;
                case 4:
                    updateData();
                    break;
            }
        } while (pil != 5);

    }

}
