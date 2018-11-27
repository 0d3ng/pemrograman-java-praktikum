/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 24, 2018 1:04:12 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul8.tugas;

import java.util.List;
import pemrograman.java.praktikum.modul6.BukuAlamat;

/**
 *
 * @author od3ng
 */
public interface BukuAlamatService {

    void tambah(BukuAlamat alamat);

    void update(int index, BukuAlamat alamat);

    void delete(BukuAlamat alamat);

    void delete(int index);

    int getByName(String name);

    List<BukuAlamat> getAll();

}
