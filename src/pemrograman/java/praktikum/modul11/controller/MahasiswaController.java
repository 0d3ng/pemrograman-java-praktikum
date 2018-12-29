/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 21, 2018 10:43:45 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul11.controller;

import java.util.List;
import javax.swing.JOptionPane;
import pemrograman.java.praktikum.modul10.tugas.Mahasiswa;
import pemrograman.java.praktikum.modul10.tugas.MahasiswaDao;
import pemrograman.java.praktikum.modul10.tugas.MahasiswaDaoImpl;
import pemrograman.java.praktikum.modul11.FormMahasiswaMVC;
import pemrograman.java.praktikum.modul11.tabelmodel.TabelModelMahasiswa;

/**
 *
 * @author od3ng
 */
public class MahasiswaController {

    private FormMahasiswaMVC formMahasiswa;
    private TabelModelMahasiswa modelMahasiswa;
    private Mahasiswa mahasiswa;

    private MahasiswaDao dao;

    public MahasiswaController(FormMahasiswaMVC formMahasiswa) {
        this.formMahasiswa = formMahasiswa;
        this.formMahasiswa.setLocationRelativeTo(null);
        this.formMahasiswa.setTitle("Formulir Mahasiswa");
        modelMahasiswa = new TabelModelMahasiswa();
        this.formMahasiswa.getTblMahasiswa().setModel(modelMahasiswa);
        dao = new MahasiswaDaoImpl();
        loadAllMahasiswa();
    }

    public void update() {
        if (mahasiswa != null) {
            String nim = formMahasiswa.getTxtNIM().getText();
            String nama = formMahasiswa.getTxtNama().getText();
            String prodi = formMahasiswa.getTxtProdi().getText();
            String ipk = formMahasiswa.getTxtIPK().getText();
            if (!nim.isEmpty() && !nama.isEmpty() && !prodi.isEmpty() && !ipk.isEmpty()) {
                Mahasiswa m = new Mahasiswa(nim, nama, Float.parseFloat(ipk), prodi);
                if (dao.update(m)) {
                    modelMahasiswa.update(m, formMahasiswa.getTblMahasiswa().getSelectedRow());
                    JOptionPane.showMessageDialog(formMahasiswa, "Data berhasil diupdate", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(formMahasiswa, "Field tidak boleh kosong!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(formMahasiswa, "Pilih data terlebih dahulu", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void delete() {
        if (mahasiswa != null) {
            if (JOptionPane.showConfirmDialog(formMahasiswa, "Apakah data mahasiswa akan dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                if (dao.delete(mahasiswa)) {
                    modelMahasiswa.delete(mahasiswa, modelMahasiswa.getRowCount() - 1);
                    JOptionPane.showMessageDialog(formMahasiswa, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
        } else {
            JOptionPane.showMessageDialog(formMahasiswa, "Pilih data terlebih dahulu", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void insert() {
        String nim = formMahasiswa.getTxtNIM().getText();
        String nama = formMahasiswa.getTxtNama().getText();
        String prodi = formMahasiswa.getTxtProdi().getText();
        String ipk = formMahasiswa.getTxtIPK().getText();
        if (!nim.isEmpty() && !nama.isEmpty() && !prodi.isEmpty() && !ipk.isEmpty()) {
            Mahasiswa m = new Mahasiswa(nim, nama, Float.parseFloat(ipk), prodi);
            dao.simpan(m);
            modelMahasiswa.insert(m, modelMahasiswa.getRowCount());
            JOptionPane.showMessageDialog(formMahasiswa, "Data berhasil ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            clear();
        } else {
            JOptionPane.showMessageDialog(formMahasiswa, "Field tidak boleh kosong!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void loadAllMahasiswa() {
        List<Mahasiswa> mahasiswas = dao.getAll();
        if (!mahasiswas.isEmpty()) {
            modelMahasiswa.addAll(mahasiswas);
        }
    }

    public void selectRowTabelMahasiswa() {
        int selectedRow = formMahasiswa.getTblMahasiswa().getSelectedRow();
        if (selectedRow > -1) {
            Mahasiswa mhs = modelMahasiswa.getList().get(selectedRow);
            this.mahasiswa = mhs;
            formMahasiswa.getTxtNIM().setText(mhs.getNim());
            formMahasiswa.getTxtNama().setText(mhs.getNama());
            formMahasiswa.getTxtProdi().setText(mhs.getProdi());
            formMahasiswa.getTxtIPK().setText("" + mhs.getIpk());
        }
    }

    private void clear() {
        formMahasiswa.getTxtNIM().setText("");
        formMahasiswa.getTxtNama().setText("");
        formMahasiswa.getTxtProdi().setText("");
        formMahasiswa.getTxtIPK().setText("");
        formMahasiswa.getTblMahasiswa().getSelectionModel().clearSelection();
        mahasiswa = null;
    }

}
