/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 8, 2018 3:38:57 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul10.tugas;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class MahasiswaApp {
    
    private static MahasiswaDao dao = new MahasiswaDaoImpl();

    public static void main(String[] args) {
//        Mahasiswa mahasiswa = new Mahasiswa("07540099", "Noprianto", 3.75F, "Teknik Informatika");
//        if (dao.simpan(mahasiswa)) {
//            System.out.println("Insert berhasil");
//        } else {
//            System.out.println("Insert gagal");
//        }

        int pilih = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("=================================");
            System.out.println("Aplikasi CRUD Mahasiswa Sederhana");
            System.out.println("1. Input data");
            System.out.println("2. Update data");
            System.out.println("3. Delete data");
            System.out.println("4. Tampil data");
            System.out.println("5. Cari data berdasarkan nim");
            System.out.println("6. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih [1...6]: ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    input();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    tampil();
                    break;
                case 5:
                    cari();
                    break;
            }
        } while (pilih != 6);
    }

    private static void input() {
        
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        Mahasiswa m = new Mahasiswa();
        System.out.print("Masukan nim   : ");
        m.setNim(s.next());
        System.out.print("Masukan nama  : ");
        m.setNama(s.next());
        System.out.print("Masukan prodi : ");
        m.setProdi(s.next());
        System.out.print("Masukan ipk   : ");
        float ipk = s.nextFloat();
        m.setIpk(ipk);
        if (dao.simpan(m)) {
            System.out.println("Berhasil insert");
        } else {
            System.out.println("Gagal insert");
        }
    }

    private static void tampil() {
        List<Mahasiswa> all = dao.getAll();
        System.out.println("Data mahasiswa ");
        for (Mahasiswa mahasiswa : all) {
            System.out.println("Nim     : "+mahasiswa.getNim());
            System.out.println("Nama    : "+mahasiswa.getNama());
            System.out.println("Prodi   : "+mahasiswa.getProdi());
            System.out.println("IPK     : "+mahasiswa.getIpk());
        }
        
    }

    private static void update() {
        tampil();
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        Mahasiswa m = new Mahasiswa();
        System.out.print("Masukan nim   : ");
        m.setNim(s.next());
        System.out.print("Masukan nama  : ");
        m.setNama(s.next());
        System.out.print("Masukan prodi : ");
        m.setProdi(s.next());
        System.out.print("Masukan ipk   : ");
        m.setIpk(s.nextFloat());
        if (dao.update(m)) {
            System.out.println("Berhasil update");
        } else {
            System.out.println("Gagal update");
        }
    }

    private static void delete() {
        tampil();
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        Mahasiswa m = new Mahasiswa();
        System.out.print("Masukan nim   : ");
        m.setNim(s.next());
        System.out.print("Anda yakin akan menghapus?(Y/N)");
        String answer = s.next();
        if (answer.equalsIgnoreCase("y")) {
            if (dao.delete(m)) {
            System.out.println("Berhasil delete");
        } else {
            System.out.println("Gagal delete");
        }
        }
    }

    private static void cari() {
        Scanner s = new Scanner(System.in).useDelimiter("\\n");;
        Mahasiswa m = new Mahasiswa();
        System.out.print("Masukan nim   : ");
        m.setNim(s.next());
        if (dao.getByNim(m.getNim())!=null) {
            System.out.println("Data ketemu");
        } else {
            System.out.println("Data tidak ketemu");
        }
    }

}
