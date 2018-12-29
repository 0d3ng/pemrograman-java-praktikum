/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 8, 2018 2:36:55 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul10.tugas;

import java.util.List;

/**
 *
 * @author od3ng
 */
public interface MahasiswaDao {

    public boolean simpan(Mahasiswa m);

    public boolean update(Mahasiswa m);

    public boolean delete(Mahasiswa m);

    public List<Mahasiswa> getAll();

    public Mahasiswa getByNim(String nim);
}
