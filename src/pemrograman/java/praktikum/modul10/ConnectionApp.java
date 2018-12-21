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

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class ConnectionApp {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/praktikum_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection=dataSource.getConnection();
            System.out.println("Koneksi berhasil.");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionApp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
