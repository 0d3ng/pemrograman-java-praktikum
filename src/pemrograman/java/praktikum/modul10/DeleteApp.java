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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class DeleteApp {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            System.out.println("Koneksi berhasil.");
            String id = "032";
            String query = "DELETE FROM EMPLOYEE_TBL WHERE ID='"+id+"'";
            Statement statement = connection.createStatement();
            int executeUpdate = statement.executeUpdate(query);
            System.out.println("Query OK, " + executeUpdate + " row affected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DeleteApp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
