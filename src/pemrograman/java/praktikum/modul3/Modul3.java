/*
 * Copyright (c) 2018
 * All rights reserved.
 * Written by nopri <lepengdados@gmail.com>, 06/10/2018
 */
package pemrograman.java.praktikum.modul3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author nopri
 */
public class Modul3 {

    public static void Latihan1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        try {
            System.out.print("Masukan sesuatu: ");
            name = br.readLine();
            System.out.println("Nama yang anda inputkan: " + name);
        } catch (IOException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Latihan1a() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int panjang, lebar;
        try {
            System.out.print("Masukan panjang: ");
            panjang = Integer.parseInt(br.readLine());
            System.out.print("Masukan lebar: ");
            lebar = Integer.parseInt(br.readLine());
            System.out.println("Luas: " + (panjang * lebar));
            System.out.println("Keliling: " + (2 * (panjang + lebar)));
        } catch (IOException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Latihan2() {
        String name;
        name = JOptionPane.showInputDialog("Masukan angka: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }

    public static void Latihan2a() {
        String name;
        ImageIcon icon = new ImageIcon(Modul3.class.getResource("/pemrograman/java/praktikum/icon/face.png"));
        name = (String) JOptionPane.showInputDialog(null, "Masukan jenis kelamin: ", "Jenis Kelamin", JOptionPane.QUESTION_MESSAGE, icon, new Object[]{"Laki-laki", "Perempuan"}, "Laki-laki");
        JOptionPane.showMessageDialog(null, "Jenis kelamin yang anda masukan adalah " + name);
    }

    public static void Latihan2b() {
        String name;
        ImageIcon icon = new ImageIcon(Modul3.class.getResource("/pemrograman/java/praktikum/icon/face.png"));
        name = (String) JOptionPane.showInputDialog(null, "Masukan jenis kelamin: ", "Jenis Kelamin", JOptionPane.QUESTION_MESSAGE, icon, new Object[]{"Laki-laki", "Perempuan"}, "Laki-laki");
        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Anda yakin memiliki jenis kelamin " + name + "?", "Konfirmasi jenis kelamin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        switch (showConfirmDialog) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Jenis kelamin Anda adalah " + name);
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Jenis kelamin Anda adalah bukan " + name);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Anda tidak memiliki jenis kelamin!");
                break;
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        }
//        Latihan1();
//        Latihan1a();
//        Latihan2();
//        Latihan2a();
        Latihan2b();
    }

}
