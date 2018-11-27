/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 24, 2018 1:12:22 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul8.tugas;

import java.util.Scanner;
import pemrograman.java.praktikum.modul6.BukuAlamat;
import pemrograman.java.praktikum.modul6.tugas.Validasi;

/**
 *
 * @author od3ng
 */
public class BukuAlamatMain {

    private Scanner s = new Scanner(System.in);
    private BukuAlamatService service;
    private OPERASI operasi;

    enum OPERASI {
        UPDATE, SIMPAN
    }

    public BukuAlamatMain() {
        service = new BukuAlamatRepository();
    }

    private void isiData(int index) {
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
                                service.tambah(ba);
                            } else {
                                service.update(index, ba);
                            }
                        }
                    }

                }

            }
        }

    }

    private void hapusData() {
        if (service.getAll().isEmpty()) {
            System.out.println("Buku alamat masih kosong!");
        } else {
            System.out.print("Masukan nama yang akan dihapus? ");
            String nama = s.next();
            int index = service.getByName(nama);
            if (index == -1) {
                System.out.println("Nama " + nama + " tidak ditemukan!");
            } else {
                System.out.print("Anda yakin akan menghapus " + nama + "?(y/n)");
                String answer = s.next();
                if (answer.equalsIgnoreCase("y")) {
                    service.delete(index);
                }
            }
        }
    }

    private void tampilData() {
        if (service.getAll().isEmpty()) {
            System.out.println("Buku alamat masih kosong!");
        } else {
            int counter = 1;
            for (BukuAlamat bukuAlamat : service.getAll()) {
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

    private void updateData() {
        if (service.getAll().isEmpty()) {
            System.out.println("Buku alamat masih kosong!");
        } else {
            System.out.print("Masukan nama yang akan diupdate? ");
            String nama = s.next();
            int index = service.getByName(nama);
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

    public void menu() {
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
    
    public static void main(String[] args) {
        new BukuAlamatMain().menu();
    }

}
