/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 1, 2018 1:25:22 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul9;

/**
 *
 * @author od3ng
 */
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            System.out.println("" + args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Exception caught!");
        }
    }
}
