/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng Create at Oct 20, 2018 4:42:55 AM
 * Email: lepengdados@gmail.com
 * Github: https://github.com/0d3ng
 * Hp: 085878554150

 */
package pemrograman.java.praktikum.modul5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Modul5 {

    public static void contoh1() {
        int[] ages = new int[100];
        for (int age : ages) {
            System.out.print("" + age);
        }
    }

    public static void contoh2() {
        int[] ages = new int[100];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            System.out.print("" + age);

        }
    }

    public static void contoh3() {
        int[][] twoD = new int[512][128];
        char[][][] threeD = new char[8][16][24];
        String[][] dogs = {{"terry", "brown"},
        {"kristin", "white"},
        {"toby", "grey"},
        {"fido", "black"},};
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs[i].length; j++) {
                System.out.print(dogs[i][j] + "\t");

            }
            System.out.println("");
        }
    }

    public static void contoh4() {
        ArrayList somethings = new ArrayList();
        somethings.add("makan");
        somethings.add("nasi");
        somethings.add("jagung");
        somethings.add(10);
        System.out.println("" + somethings);
    }

    public static void contoh5() {
        double[][][] nilai = {
            {{51.58, 89.94}, {60.06, 59.58}, {52.93, 47.63}, {89.98, 77.56}, {45.87, 94.56}},
            {{39.46, 58.41}, {71.42, 85.37}, {39.08, 78.21}, {79.03, 80.32}, {45.49, 23.47}},
            {{81.09, 32.24}, {51.86, 86.92}, {59.58, 31.69}, {96.18, 26.72}, {28.76, 91.54}}
        };
        for (int i = 0; i < nilai.length; i++) {
            double[][] dses = nilai[i];
            for (int j = 0; j < dses.length; j++) {
                double[] dse = dses[j];
                for (int k = 0; k < dse.length; k++) {
                    double d = dse[k];
                    System.out.print("[" + i + "," + j + "," + k + "]: " + d+"\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    public static void matrikIdentitas() {
        byte tinggi;
        System.out.print("Masukan tinggi matriks: ");
        Scanner s = new Scanner(System.in);
        tinggi = s.nextByte();
        int matriks[][] = new int[tinggi][tinggi];
        int x = 0, y;
        y = matriks.length - 1;
        for (int i = 0; i < matriks.length; i++) {
            int[] matrik = matriks[i];
            for (int j = 0; j < matrik.length; j++) {
                System.out.print("matriks[" + i + "," + j + "]: ");
                s = new Scanner(System.in);
                int input = s.nextInt();
                if (i == x && j == y) {
                    matriks[i][j] = 0;
                } else {
                    matriks[i][j] = input;
                }
            }
            x++;
            y--;
        }
        for (int[] matrik : matriks) {
            for (int j = 0; j < matrik.length; j++) {
                int k = matrik[j];
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }

    public static void calculateSubMatriks() {
        byte tinggi;
        System.out.print("Masukan tinggi matriks: ");
        Scanner s = new Scanner(System.in);
        tinggi = s.nextByte();
        int matriks[][] = new int[tinggi][tinggi];
        int temp[] = new int[tinggi];
        for (int i = 0; i < matriks.length; i++) {
            int[] matrik = matriks[i];
            for (int j = 0; j < matrik.length; j++) {
                System.out.print("matriks[" + i + "," + j + "]: ");
                s = new Scanner(System.in);
                int input = s.nextInt();
                matriks[i][j] = input;
                if (j == temp.length - 1) {
                    temp[i] = input;
                }
            }
        }

        for (int[] matrik : matriks) {
            for (int j = 0; j < matrik.length; j++) {
                int k = matrik[j];
                System.out.print(k + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("min     : " + min(temp));
        System.out.println("max     : " + max(temp));
        System.out.println("average : " + average(temp));
        System.out.println("sum     : " + sum(temp));
    }

    private static float average(int matriks[]) {
        double sum = 0;
        for (int matrik : matriks) {
            sum += matrik;
        }
        return (float) (sum / matriks.length);
    }

    private static int min(int matriks[]) {
        int min = Integer.MAX_VALUE;
        for (int matrik : matriks) {
            if (matrik < min) {
                min = matrik;
            }
        }
        return min;
    }

    private static int max(int matriks[]) {
        int max = Integer.MIN_VALUE;
        for (int matrik : matriks) {
            if (matrik > max) {
                max = matrik;
            }
        }
        return max;
    }

    private static int sum(int matriks[]) {
        int min = 0;
        for (int matrik : matriks) {
            min += matrik;
        }
        return min;
    }

}
