/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 1, 2018 4:42:26 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul9.latihan;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorService service = new CalculatorBeras();
        CalculatorAdvanceService advanceService = new CalculatorBagus();
        int choose = 0;
        Scanner s = new Scanner(System.in);
        do {

            System.out.println("");
            System.out.println("...Contoh Exception...");
            System.out.println("======================");
            System.out.println("1. Kali");
            System.out.println("2. Bagi");
            System.out.println("3. Tambah");
            System.out.println("4. Kurang");
            System.out.println("5. Advance Kalkulator");
            System.out.println("6. Keluar");
            System.out.print("Pilih [1...6]: ");
            try {
                choose = s.nextInt();
            } catch (Exception e) {
                System.err.println("Please input the number!");
                choose = 0;
                s = new Scanner(System.in);
            }
            switch (choose) {
                case 1:
                    perkalian(s, service);
                    break;
                case 2:
                    pembagian(s, service);
                    break;
                case 3:
                    penambahan(s, service);
                    break;
                case 4:
                    pengurangan(s, service);
                    break;
                case 5:
                    subMenu(choose, s, advanceService);
                    break;
            }

        } while (choose != 6);
    }

    private static void subMenu(int choose, Scanner s, CalculatorAdvanceService advanceService) {
        do {
            System.out.println("1. Akar");
            System.out.println("2. Pangkat");
            System.out.println("3. Sebelumnya");
            System.out.print("Pilih [1...3]: ");
            try {
                choose = s.nextInt();
            } catch (Exception e) {
                System.err.println("Please input the number!");
                choose = 0;
                s = new Scanner(System.in);
            }
            switch (choose) {
                case 1:
                    akar(s, advanceService);
                    break;
                case 2:
                    kuadrat(s, advanceService);
                    break;
            }

        } while (choose != 3);
    }

    private static void kuadrat(Scanner s, CalculatorAdvanceService advanceService) {
        try {
            //kuadrat
            System.out.print("x         : ");
            double x = s.nextDouble();
            System.out.print("y         : ");
            double y = s.nextDouble();
            System.out.println("hasil   :" + advanceService.Pangkat(x, y));
        } catch (ErrorMe ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void akar(Scanner s, CalculatorAdvanceService advanceService) {
        try {
            //akar
            System.out.print("x         : ");
            double x = s.nextDouble();
            System.out.println("hasil   :" + advanceService.Akar(x));
        } catch (ErrorMe ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void perkalian(Scanner s, CalculatorService service) {
        try {
            //perkalian
            System.out.print("x         : ");
            double x = s.nextDouble();
            System.out.print("y         : ");
            double y = s.nextDouble();
            System.out.println("hasil   :" + service.Ping(x, y));
        } catch (ErrorMe ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void pembagian(Scanner s, CalculatorService service) {
        try {
            double x;
            double y;
            //pembagian
            System.out.print("x         : ");
            x = s.nextDouble();
            System.out.print("y         : ");
            y = s.nextDouble();
            System.out.println("hasil   :" + service.Po(x, y));
        } catch (ErrorMe ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void penambahan(Scanner s, CalculatorService service) {
        try {
            double x;
            double y;
            //penambahan
            System.out.print("x         : ");
            x = s.nextDouble();
            System.out.print("y         : ");
            y = s.nextDouble();
            System.out.println("hasil   :" + service.Lan(x, y));
        } catch (ErrorMe ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void pengurangan(Scanner s, CalculatorService service) {
        try {
            double x;
            double y;
            //pengurangan
            System.out.print("x         : ");
            x = s.nextDouble();
            System.out.print("y         : ");
            y = s.nextDouble();
            System.out.println("hasil   :" + service.Do(x, y));
        } catch (ErrorMe ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
