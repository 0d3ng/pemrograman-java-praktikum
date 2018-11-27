/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 24, 2018 12:55:52 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul8.interfacevsabstract;

/**
 *
 * @author od3ng
 */
public class Lingkaran implements BangunDatarInterface {

    @Override
    public double luas(double x) {
        return Math.PI * x * x;
    }

    @Override
    public double keliling(double x) {
        return 2 * Math.PI * x;
    }

}
