/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author acer
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String url = "jdbc:sqlserver://127.0.0.1;database=PBD;user=sa;password=123";
        Connection conn = DriverManager.getConnection(url);
        if (conn != null){
            System.out.println("1");
        }
    }
    
}
