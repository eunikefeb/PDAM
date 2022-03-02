/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdam;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PDAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       int []  id = {1, 2, 3, 4, 5};
       String nama [] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
       
        System.out.print("Masukkan ID Pelanggan : ");
        int inputId = a.nextInt();
        
        System.out.print("Masukkan Banyak Pemakaian (m3) : ");
        int pemakaian = a.nextInt();
        
        int tarif = 2000;
        
        int totalPembayaran = 10 * tarif;
        pemakaian -= 10;
        tarif = 3000;
        
        if(pemakaian >= 10){
            totalPembayaran += 10*tarif;
            pemakaian -= 10;
            tarif = 4000;
        }
        
        if(pemakaian >= 10){
            totalPembayaran += 10 * tarif;
            pemakaian -= 10;
            tarif = 5000;
        }
        
        if(pemakaian >= 10){
            totalPembayaran += 10*tarif;
            pemakaian -= 10;
            tarif = 5000;
        }
        
        if(pemakaian < 0){
            pemakaian = 0;
        }
        
        totalPembayaran += tarif  * pemakaian;
        totalPembayaran += 10000;
        
        System.out.println("Id Pelanggan : " + inputId);
        System.out.println("Nama Pelanggan : " + nama[inputId - 1]);
        System.out.println("Pemakaian : " + pemakaian + " m3");
        System.out.println("Jumlah Tagihan : Rp " + totalPembayaran);
    
    }
    
}

