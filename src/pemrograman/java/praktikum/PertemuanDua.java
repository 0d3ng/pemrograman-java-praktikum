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
public class PertemuanDua {

    public static void hitungWaktu() {
        int detik = 7200;
        int sisaJam = (detik / 3600);
        System.out.println("Dalam detik: " + detik);
        System.out.println("Jam: " + sisaJam);
        int sisaMenit = (detik % 60);
        System.out.println("menit: " + sisaMenit);
        System.out.println("detik: " + (sisaMenit / 60));
    }

}
