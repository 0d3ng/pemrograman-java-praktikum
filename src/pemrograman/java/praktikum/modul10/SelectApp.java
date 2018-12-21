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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class SelectApp {
    
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            System.out.println("Koneksi berhasil.");
            String query = "SELECT ID,NAME,DEPARTMENT,JOB_TITLE,HIRE_DATE,PERMANENT_EMPLOYEE,SALARY FROM EMPLOYEE_TBL";
            Statement statement = connection.createStatement();
            ResultSet executeQuery = statement.executeQuery(query);
            while (executeQuery.next()) {
                System.out.println("" + executeQuery.getString("ID"));
                System.out.println("" + executeQuery.getString("NAME"));
                System.out.println("" + executeQuery.getString("DEPARTMENT"));
                System.out.println("" + executeQuery.getString("JOB_TITLE"));
                System.out.println("" + executeQuery.getString("HIRE_DATE"));
                System.out.println("" + executeQuery.getString("PERMANENT_EMPLOYEE"));
                System.out.println("" + executeQuery.getString("SALARY"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SelectApp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SelectApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
