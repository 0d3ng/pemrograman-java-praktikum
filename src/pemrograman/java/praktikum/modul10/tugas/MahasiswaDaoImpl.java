/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 8, 2018 2:56:40 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul10.tugas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class MahasiswaDaoImpl implements MahasiswaDao {

    private final String INSERT = "INSERT INTO mahasiswa VALUES(?,?,?,?)";
    private final String UPDATE = "UPDATE mahasiswa SET nama=?,prodi=?,ipk=? WHERE nim=?";
    private final String DELETE = "DELETE FROM mahasiswa WHERE nim=?";
    private final String GETALL = "SELECT nim,nama,prodi,ipk FROM mahasiswa";
    private final String GET_BY_NIM = "SELECT nim,nama,prodi,ipk FROM mahasiswa WHERE nim=?";

    public MahasiswaDaoImpl() {
    }

    @Override
    public boolean simpan(Mahasiswa m) {
        boolean status = false;
        PreparedStatement prepareStatement = null;
        try {
            prepareStatement = Koneksi.getConnection().prepareStatement(INSERT);
            prepareStatement.setString(1, m.getNim());
            prepareStatement.setString(2, m.getNama());
            prepareStatement.setString(3, m.getProdi());
            prepareStatement.setFloat(4, m.getIpk());
            if (prepareStatement.executeUpdate() > 0) {
                status = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (prepareStatement != null) {
                try {
                    prepareStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return status;
    }

    @Override
    public boolean update(Mahasiswa m) {
        boolean status = false;
        PreparedStatement prepareStatement = null;
        try {
            prepareStatement = Koneksi.getConnection().prepareStatement(UPDATE);
            prepareStatement.setString(1, m.getNama());
            prepareStatement.setString(2, m.getProdi());
            prepareStatement.setFloat(3, m.getIpk());
            prepareStatement.setString(4, m.getNim());
            if (prepareStatement.executeUpdate() > 0) {
                status = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (prepareStatement != null) {
                try {
                    prepareStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return status;
    }

    @Override
    public boolean delete(Mahasiswa m) {
        boolean status = false;
        PreparedStatement prepareStatement = null;
        try {
            prepareStatement = Koneksi.getConnection().prepareStatement(DELETE);
            prepareStatement.setString(1, m.getNim());
            if (prepareStatement.executeUpdate() > 0) {
                status = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (prepareStatement != null) {
                try {
                    prepareStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return status;
    }

    @Override
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        ResultSet executeQuery = null;
        try {
            executeQuery = Koneksi.getConnection().createStatement().executeQuery(GETALL);
            while (executeQuery.next()) {
                Mahasiswa m = new Mahasiswa();
                m.setNim(executeQuery.getString("nim"));
                m.setNama(executeQuery.getString("nama"));
                m.setProdi(executeQuery.getString("prodi"));
                m.setIpk(executeQuery.getFloat("ipk"));
                list.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (executeQuery != null) {
                try {
                    executeQuery.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

    @Override
    public Mahasiswa getByNim(String nim) {
        Mahasiswa m = null;
        ResultSet executeQuery = null;
        try {
            PreparedStatement prepareStatement = Koneksi.getConnection().prepareStatement(GET_BY_NIM);
            prepareStatement.setString(1, nim);
            executeQuery = prepareStatement.executeQuery();
            if (executeQuery.next()) {
                m = new Mahasiswa();
                m.setNim(executeQuery.getString("nim"));
                m.setNama(executeQuery.getString("nama"));
                m.setProdi(executeQuery.getString("prodi"));
                m.setIpk(executeQuery.getFloat("ipk"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (executeQuery != null) {
                try {
                    executeQuery.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return m;
    }

}
