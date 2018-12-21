/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 1, 2018 4:39:54 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul9.latihan;

/**
 *
 * @author od3ng
 */
public class CalculatorBagus implements CalculatorAdvanceService {

    @Override
    public double Akar(double x) throws ErrorMe {
        if (x == 0) {
            throw new ErrorMe("Jangkrik bozz!");
        } else {
            return Math.sqrt(x);
        }
    }

    @Override
    public double Pangkat(double x, double y) throws ErrorMe {
        if (x == 0) {
            throw new ErrorMe("Jangkrik bozz!");
        } else {
            return Math.pow(x, y);
        }
    }

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
