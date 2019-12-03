/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class Koneksi {
    private String url = "jdbc:sqlserver://127.0.0.1;database=PBD;user=sa;password=123";
    private Connection conn;

    public Connection getConn() throws Exception {
        conn = DriverManager.getConnection(url);
        return conn;
    }
     public int dml(String query){
        int jumlah = 0;
        try {
            conn = DriverManager.getConnection(url);
            java.sql.Statement save = conn.createStatement();
            jumlah = save.executeUpdate(query);
            conn.close();
        } catch (Exception e) {
        }
        return jumlah;
    }

    public void resetTable(JTable namaTable){
        while(namaTable.getRowCount()>0) {            
            ((DefaultTableModel) namaTable.getModel()).removeRow(0);
        }
     }
}
