/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 24, 2018 1:06:05 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul8.tugas;

import java.util.ArrayList;
import java.util.List;
import pemrograman.java.praktikum.modul6.BukuAlamat;

/**
 *
 * @author od3ng
 */
public class BukuAlamatRepository implements BukuAlamatService {

    List<BukuAlamat> bukuAlamats = new ArrayList<>();

    @Override
    public void tambah(BukuAlamat alamat) {
        bukuAlamats.add(alamat);
    }

    @Override
    public void update(int index, BukuAlamat alamat) {
        bukuAlamats.set(index, alamat);
    }

    @Override
    public void delete(BukuAlamat alamat) {
        bukuAlamats.remove(alamat);
    }

    @Override
    public List<BukuAlamat> getAll() {
        return bukuAlamats;
    }

    @Override
    public int getByName(String name) {
        for (int i = 0; i < bukuAlamats.size(); i++) {
            BukuAlamat ba = bukuAlamats.get(i);
            if (ba.getNama().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(int index) {
        bukuAlamats.remove(index);
    }

}
