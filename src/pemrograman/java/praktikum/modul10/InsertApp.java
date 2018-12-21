/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 7, 2018 2:14:27 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class InsertApp {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            System.out.println("Koneksi berhasil.");
            String id = "032";
            String name = "Muhammad Sigit Arifianto";
            String department = "Business Development";
            String jobTitle = "Account Manager";
            String hireDate = "2000-12-30";
            byte permanentEmployee = 1;
            double salary = 8500000;
            String query = "INSERT INTO EMPLOYEE_TBL(ID,NAME,DEPARTMENT,JOB_TITLE,HIRE_DATE,PERMANENT_EMPLOYEE,SALARY)VALUES("
                    + "'" + id + "','" + name + "','" + department + "','" + jobTitle + "','" + hireDate + "'," + permanentEmployee + "," + salary + ")";
//            contoh menggunakna preparestatment
            String sql = "INSERT INTO EMPLOYEE_TBL(ID,NAME,DEPARTMENT,JOB_TITLE,HIRE_DATE,PERMANENT_EMPLOYEE,SALARY)VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, id);
            prepareStatement.setString(2, name);
            prepareStatement.setString(3, department);
            prepareStatement.setString(4, jobTitle);
            prepareStatement.setString(5, hireDate);
            prepareStatement.setByte(6, permanentEmployee);
            prepareStatement.setDouble(7, salary);
            if (prepareStatement.executeUpdate()>0) {
                System.out.println("Insert berhasil");
            } else {
                System.out.println("Insert gagal");
            }
//            Statement statement = connection.createStatement();
//            int executeUpdate = statement.executeUpdate(query);
//            System.out.println("Query OK, " + executeUpdate + " row affected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertApp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
