/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menghitung nilai rata-rata
 */
public class PBOIF210119064Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    
    public static double rataRataNilai(int banyakMhs, double jumlah){
        double rataNilai = jumlah/banyakMhs;
        return rataNilai;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int banyakMhs; 
        double nilai, 
               jumlah = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMhs = keyboard.nextInt();
        for (int i = 1; i <= banyakMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = keyboard.nextInt();
            jumlah += nilai;
        }
        
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRataNilai(banyakMhs, jumlah));
        System.out.println("Developed by : Bagus Budi Wibowo");
        
    }
    
}
