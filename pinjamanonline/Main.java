/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pinjamanonline;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
      public static void main(String[] args) {        
         // Array untuk menyimpan data pelanggan
        PinjamOnline[] PinjamOnline = new PinjamOnline[3];
        PinjamOnline[0] = new PinjamOnline("Tia");
        PinjamOnline[1] = new PinjamOnline("Fira");
        PinjamOnline[2] = new PinjamOnline("Ani");
        
        // Skenario 3
        PinjamOnline[0].Pinjam();
        PinjamOnline[1].Kembalikan();
        PinjamOnline[1].Pinjam();
        PinjamOnline[0].Kembalikan();
        PinjamOnline[2].Pinjam();
        PinjamOnline[0].Kembalikan();
        
      
        for(int i=0;i<PinjamOnline.length;i++){
            System.out.println("Nama: "+PinjamOnline[i].nama);
            System.out.println("Nominal: "+PinjamOnline[i].getPinjaman());
            System.out.println("Lama Pinjaman: "+PinjamOnline[i].getLamaPeminjaman());
            
        }
          System.out.println("Saldo sistem: "+PinjamOnline[2].getSaldoSistem());
    }
}
