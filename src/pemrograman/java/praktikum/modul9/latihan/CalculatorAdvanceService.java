/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 1, 2018 2:41:29 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul9.latihan;

/**
 *
 * @author od3ng
 */
public interface CalculatorAdvanceService extends CalculatorService {

    double Akar(double x) throws ErrorMe;

    double Pangkat(double x, double y) throws ErrorMe;
}
