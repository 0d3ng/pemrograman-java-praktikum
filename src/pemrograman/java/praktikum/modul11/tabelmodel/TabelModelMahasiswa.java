/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 21, 2018 9:52:59 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul11.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pemrograman.java.praktikum.modul10.tugas.Mahasiswa;

/**
 *
 * @author od3ng
 */
public class TabelModelMahasiswa extends AbstractTableModel {

    private final String[] COLUMNS = {"NIM", "Nama", "Program Studi", "IPK"};
    private List<Mahasiswa> list = new ArrayList<>();

    public TabelModelMahasiswa() {
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNim();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getProdi();
            case 3:
                return list.get(rowIndex).getIpk();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIM";
            case 1:
                return "Nama";
            case 2:
                return "Program Studi";
            case 3:
                return "IPK";
        }
        return null;
    }

    public void insert(Mahasiswa m, int index) {
        list.add(index, m);
        fireTableRowsInserted(index, index);
    }
    
    public void update(Mahasiswa m,int index){
        list.set(index, m);
        fireTableRowsUpdated(index, index);
    }
    
    public void delete(Mahasiswa m,int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
    }
    
    public void addAll(List<Mahasiswa> mahasiswas){
        list.clear();
        list.addAll(mahasiswas);
        fireTableDataChanged();
    }

    public List<Mahasiswa> getList() {
        return list;
    }

}
