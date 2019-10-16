/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan37.ratanilai;

/**
 *
 * @author User
 */
public class ratanilai {
    public int mahasiswa;
    public double nilai=0;

    public int getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(int mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai+nilai;
    }
  public double rata(){
      return mahasiswa/nilai;
  }
    
}
