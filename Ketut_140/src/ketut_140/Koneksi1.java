package ketut_140;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi1 {
    
    private String url = "jdbc:sqlserver://192.168.171.233;database:Praktikum;user:P18410100140;password:P180140I_a";
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
    
}
