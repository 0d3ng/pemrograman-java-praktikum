/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman.java.praktikum.modul4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Modul4 {

    private static void Latihan1() {
        double grade = 92;
        if (grade >= 90) {
            System.out.println("Excellent!");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Good Job!");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("Study Hardner");
        } else {
            System.out.println("Sorry you failed");
        }
    }

    private static void Latihan2() {
//        double grade = 92;
//        switch ((int) grade) {
//            case 100:
//            case 92:
//                System.out.println("Excellent!");
//                break;
//            case 90:
//                System.out.println("Good Job!");
//                break;
//            case 80:
//                System.out.println("Study Hardner");
//                break;
//            default:
//                System.out.println("Sorry you failed");
//        }
        String nama = "tono";
        switch (nama) {
            case "tono":
            case "toni":
            case "tini":
            case "tika":
                System.out.println("Mahasiswa");
                break;
            case "pak budi":
            case "pak badu":
                System.out.println("Dosen");
                break;
            default:
                System.out.println("Another");
        }
    }

    private static void Latihan3() {
        String names[] = {"Tono", "Tini", "Tito", "Tedy", "Toni", "Tommy", "Tompel", "Tompi", "Tika"};
        String searchName = "Yza";
        boolean found = false;

        for (String name : names) {
            if (name.equals(searchName)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Search name " + searchName + " found");
        } else {
            System.out.println("Search name " + searchName + " not found");
        }
    }

    private static void Latihan4() {
        String names[] = {"Tono", "Tini", "Tito", "Tedy", "Toni", "Tommy", "Tompel", "Tompi", "Tika"};
        int count = 0;
        searchLabel:
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Tito")) {
                break searchLabel;
            }
            count++;
        }
        System.out.println("Count is " + count);
    }

    private static void Latihan5() {
        String names[] = {"Tono", "Tini", "Tito", "Tedy", "Toni", "Tommy", "Tompel", "Tompi", "Tika"};
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Tito")) {
                continue;
            }
            count++;
        }
        System.out.println("Count is " + count);
    }

    private static void Latihan6() {
        int count = 0;
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Inside for(j) loop " + (count++));
                if (j == 2) {
                    continue outerLoop;
                }
            }
            System.out.println("Inside for(i) loop");
        }
    }

    private static void TugasKelas() {
        float bilangan;
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan bilangan:");
        bilangan = s.nextFloat();
        temp = (int) bilangan;
        if (bilangan == 0) {
            System.out.println("Bilangan nol");
        } else if ((bilangan - temp) > 0) {
            System.out.println("Bilangan pecahan positif");
        } else if ((bilangan - temp) < 0) {
            System.out.println("Bilangan pecahan negatif");
        } else if ((bilangan - temp) == 0 && bilangan > 0) {
            System.out.println("Bilangan bulat positif");
        } else if ((bilangan - temp) == 0 && bilangan < 0) {
            System.out.println("Bilangan bulat negatif");
        } else {
            System.out.println("Bilangan yang lain");
        }
    }

    public static void main(String[] args) {
//        Latihan1();
//        Latihan2();
//        Latihan3();
//        Latihan4();
//        Latihan5();
//        Latihan6();
        TugasKelas();
    }
}
