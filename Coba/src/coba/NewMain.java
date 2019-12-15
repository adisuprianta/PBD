/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,Integer> c = new HashMap<String,Integer>();
        c.put("Satu", 1);
        c.put("Dua", 2);
        c.put("Tiga", 3);
        c.put("Empat", 4);
        System.out.println(c.keySet());
        Koneksi conn =new Koneksi();
        HashMap<String,String> cboMap = new  HashMap<String,String>();
        try {
            Statement smt = conn.getConn().createStatement();
            ResultSet rs = smt.executeQuery("select Region_id,Region_name from REGIONS");
             while (rs.next()) {                 
                 cboMap.put(rs.getString("Region_name"), rs.getString("Region_id"));
             }
             for(String dsc: cboMap.keySet()){System.out.println(dsc);}
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
    }
    
}
