/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 1, 2018 2:43:22 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul9.latihan;

/**
 *
 * @author od3ng
 */
public class CalculatorBeras implements CalculatorService {

    @Override
    public double Ping(double x, double y) throws ErrorMe {
        if (x == 0 || y == 0) {
            throw new ErrorMe("Jangkrik bozz!");
        } else {
            return x * y;
        }
    }

    @Override
    public double Po(double x, double y) throws ErrorMe {
        if (y == 0) {
            throw new ErrorMe("Jangkrik bozz!");
        } else {
            return x / y;
        }
    }

    @Override
    public double Lan(double x, double y) throws ErrorMe {
        if (x == 0 && y == 0) {
            throw new ErrorMe("Jangkrik bozz!");
        } else {
            return x + y;
        }
    }

    @Override
    public double Do(double x, double y) throws ErrorMe {
        if (x == 0 || y == 0) {
            throw new ErrorMe("Jangkrik bozz!");
        } else {
            return x - y;
        }
    }

}
