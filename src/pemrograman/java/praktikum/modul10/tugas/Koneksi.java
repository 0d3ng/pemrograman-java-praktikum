/*
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 8, 2018 2:30:06 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.java.praktikum.modul10.tugas;

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
public class Koneksi {

    private static Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/praktikum_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
//                connection = DriverManager.getConnection(URL, USER, PASSWORD);

                //            bisa juga seperti ini
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setURL(URL);
                dataSource.setUser(USER);
                dataSource.setPassword(PASSWORD);
                connection = dataSource.getConnection();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return connection;
    }

}
