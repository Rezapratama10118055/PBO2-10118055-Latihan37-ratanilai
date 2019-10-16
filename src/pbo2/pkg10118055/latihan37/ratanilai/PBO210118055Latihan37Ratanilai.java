/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan37.ratanilai;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan37Ratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        Scanner userInput = new Scanner (System.in);
        ratanilai jumlah = new ratanilai();
        
        System.out.println("Masukkan Banyak Mahasiswa:"); 
        jumlah.mahasiswa = userInput.nextInt();
        
      
    
        for( int i=0;i<jumlah.mahasiswa;i++){
          
        System.out.println("nilai mahasiswa ke-"+(i+1)+":");
          jumlah.nilai = userInput.nextInt();
        }
        
        System.out.println("maka,rata rata nialai adalah "+ jumlah.rata());
  
            
        }
        
       
    }
    

