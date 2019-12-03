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
class Dosen {
    String nid;
    String nama;

    public Dosen(String nid, String nama) {
        this.nid = nid;
        this.nama = nama;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
