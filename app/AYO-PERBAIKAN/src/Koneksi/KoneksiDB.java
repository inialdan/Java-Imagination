/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dan
 */
public class KoneksiDB {

    private static Connection cn;

    public static Connection getkoneksi() {
        if (cn == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                cn = DriverManager.getConnection("jdbc:mysql://localhost/AYOPERBAIKAN", "root", "@r00t385");
                System.out.print("Allhamdulilah Berhasil\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cn;
    }
}
