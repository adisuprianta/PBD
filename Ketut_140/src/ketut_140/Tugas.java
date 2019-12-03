package ketut_140;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Tugas {

    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan Department_id : ");
        int id = Integer.parseInt(br.readLine());
        String dbURL = "jdbc:sqlserver://192.168.171.233;database=Praktikum;user=P18410100140;password=P180140I_a";
        Connection conn = DriverManager.getConnection(dbURL);
        Statement sqlCommand = conn.createStatement(); 
        ResultSet sqlResult =  sqlCommand.executeQuery("SELECT DEPARTMENT_ID FROM DEPARTMENTS where DEPARTMENT_ID = '"+id+"'");
        if (sqlResult.next() == false) {
            System.out.println("\'bukan department valid\'");
        } else {
            sqlResult =  sqlCommand.executeQuery("SELECT employee_id, last_name FROM employees where DEPARTMENT_ID = "+id+"");
            ArrayList<Data> dtDosen = new ArrayList<Data>();
            if (sqlResult.next() == true) {
                sqlResult =  sqlCommand.executeQuery("SELECT employee_id, last_name FROM employees where DEPARTMENT_ID = "+id+"");
                while (sqlResult.next()) {            
                    dtDosen.add(new Data (sqlResult.getString("employee_id"),sqlResult.getString("last_name")));
                }
                for (int i = 0; i < dtDosen.size(); i++) {
                    System.out.println(dtDosen.get(i).getEmid()+"\t"+dtDosen.get(i).getLastname());
                }
            } else {
                System.out.println("Belum punya karyawan");
            }
        }
        
    }
    
}
