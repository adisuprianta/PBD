package ketut_140;
import java.sql.*;
import java.util.ArrayList;
public class Koneksi {
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        String dbURL = "jdbc:sqlserver://192.168.171.233;database=Praktikum;user=P18410100140;password=P180140I_a";
        Connection conn = DriverManager.getConnection(dbURL);
        if (conn != null)
        {
            System.out.println("Connection to private SQL Server Successful");
        }
        Statement sqlCommand = conn.createStatement(); 
        ResultSet sqlResult =  sqlCommand.executeQuery("SELECT COUNT(DEPARTMENT_ID) as JML_DEPT FROM DEPARTMENTS");
        int jmlDept = 0;

        while (sqlResult.next())
        {
            jmlDept = (int) sqlResult.getObject("JML_DEPT");
        }
        System.out.println(jmlDept);
        
        
        sqlCommand = conn.createStatement();
        sqlResult =  sqlCommand.executeQuery("SELECT nid,nama_dosen from dosen");
        ArrayList<Dosen> dtDosen = new ArrayList<Dosen>();
        while (sqlResult.next()) {            
            dtDosen.add(new Dosen (sqlResult.getString("nid"),sqlResult.getString("nama_dosen")));
        }
        for (int i = 0; i < dtDosen.size(); i++) {
            System.out.println(dtDosen.get(i).getNid()+"\t"+dtDosen.get(i).getNama());
        }
        
       

    }
    
}
