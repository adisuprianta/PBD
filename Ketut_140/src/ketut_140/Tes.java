/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketut_140;

/**
 *
 * @author mhs
 */
public class Tes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi1 conn = new Koneksi1();
       int a = conn.dml("insert into dosen  values ('123456','ketut')");
        System.out.println(a);
    }
    
}
