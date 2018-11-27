/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 23, 2018 9:23:28 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul8;

/**
 *
 * @author od3ng
 */
public class Pegawai extends Orang{
    
    private String nip;

    public Pegawai(String nip, String nama, String alamat) {
        super(nama, alamat);
        this.nip = nip;
    }

    public Pegawai(String nama, String alamat) {
        super(nama, alamat);
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getNamaFromPegawai(){
        return super.getNama();
    }
}
