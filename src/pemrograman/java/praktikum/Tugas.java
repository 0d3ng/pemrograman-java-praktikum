/*
 * Copyright (c) 2018
 * All rights reserved.
 * Written by nopri <lepengdados@gmail.com>, 29/09/2018
 */
package pemrograman.java.praktikum;

/**
 *
 * @author nopri
 */
public class Tugas {

    public static void tugas1() {
        int a = 10, b = 20, c = 45;
        float hasil = (float) (a + b + c) / 3;
        System.out.println("number 1: " + a);
        System.out.println("number 1: " + b);
        System.out.println("number 1: " + c);
        System.out.println("hasil   : " + hasil);
    }

    public static void tugas2() {
        int a = 10, b = 23, c = 5;
        int max = 0;
        max = a > b ? a : (b > c ? b : c);
        System.out.println("number 1: " + a);
        System.out.println("number 1: " + b);
        System.out.println("number 1: " + c);
        System.out.println("hasil   : " + max);
    }

}
