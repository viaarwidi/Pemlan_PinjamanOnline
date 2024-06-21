/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pinjamanonline;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PinjamOnline {
    
    private static double saldoSistem = 5000000;
    private double pinjaman;
    private int lamaPeminjaman;
    public String nama;

    
    public PinjamOnline(String nama) {
        this.nama = nama;
        this.pinjaman = 0; 
        this.lamaPeminjaman = 0; 
    }

   
    public static double getSaldoSistem() {
        return saldoSistem;
    }

    public static void setSaldoSistem(double saldo) {
        saldoSistem = saldo;
    }

    public double getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(double pinjaman) {
        this.pinjaman = pinjaman;
    }

    // Getter dan setter untuk lamaPeminjaman
    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }

    public void setLamaPeminjaman(int lamaPeminjaman) {
        this.lamaPeminjaman = lamaPeminjaman;
    }

    // Method pinjaman
    public void Pinjam() {
        double pinjamuang;
        int hari;
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Selamat datang, " + nama);
        System.out.print("silahkan masukkan nominal uang yang ingin di pinjam : ");
        pinjamuang = in.nextDouble();
        System.out.print("masukkan lama peminjaman : ");
        hari = in.nextInt();
        if(getPinjaman()!= 0){
            System.out.println("Anda Masih punya pinjaman, bayar dulu yang itu!");
            System.out.println();
        }else if(pinjamuang>saldoSistem){
            System.out.println("Maaf, Nominal peminjaman terlalu besar.");
            System.out.println();
    }else if(pinjamuang<=saldoSistem){
            setPinjaman(pinjamuang);
            setLamaPeminjaman(hari);
            setSaldoSistem(getSaldoSistem()-pinjamuang);
            System.out.println("Anda berhasil pinjam");
            System.out.println();
             }
    }
        

    // Method pelunasan pinjaman
    public void Kembalikan() {
        Scanner in = new Scanner(System.in);
        double kembaliin;
        int hari;
        double denda = 0;
        System.out.println("Selamat datang," + nama);
        System.out.print("Silahkan masukkan nominal yang ingin dikembalikan : ");
        kembaliin = in.nextDouble();
        System.out.print("silahkan masukkan hari pengembalian: ");
        hari = in.nextInt();
        denda = (hari-getLamaPeminjaman())*15000;
        System.out.println();
      
        if (getPinjaman()>0){
            
            //bayar denda
            if (hari>getLamaPeminjaman()) {
               setPinjaman(getPinjaman()+denda);
               System.out.println("Pengembalian melebihi batas hari, Anda dikenakan denda sebesar : "+ denda);
                System.out.println();
              
               if (kembaliin<=getPinjaman()) {
                   setPinjaman(getPinjaman() - kembaliin);
                   setSaldoSistem(getSaldoSistem() + kembaliin);

                   if (getPinjaman() == 0) {
                       System.out.println("Terimakasih, Peminjamanmu telah lunas");
                       setLamaPeminjaman(0);
                   } else System.out.println("Terimakasih sudah menyicil");

               } else System.out.println("Pengembalian gagal, Nominal kurang dari denda atau lebih dari pengembalian yang seharusnya ");
            
            } 
            else if (kembaliin<=getPinjaman()){
                setPinjaman(getPinjaman()-kembaliin);
                setSaldoSistem(getSaldoSistem()+kembaliin);

                if (getPinjaman() == 0) {
                    System.out.println("Terima kasih telah melunasi pinjaman anda!");
                    System.out.println();
                    setLamaPeminjaman(0);
                } else System.out.println("Terima kasih telah melakukan cicilan");
                       System.out.println();

            } else System.out.println("Pengembalian gagal, nominal terlalu besar");
                   System.out.println();
        } 
            else {
                 System.out.println("Pengembalian gagal, Silahkan lakukan peminjaman terlebih dahulu");}
                 System.out.println("");
    }
    }

    

    

