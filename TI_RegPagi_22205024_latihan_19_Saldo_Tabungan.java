/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini untuk menampilkan saldo tabungan
 */
public class TI_RegPagi_22205024_latihan_19_Saldo_Tabungan {
    public static void main(String[] args){
    Scanner inputan = new Scanner(System.in);
        int saldoAwal, bungaPerBulan, lamaBulan;
        System.out.print("Saldo awal: Rp. ");
        saldoAwal = inputan.nextInt();
        System.out.print("Bunga per bulan (%): ");
        bungaPerBulan = inputan.nextInt();
        System.out.print("Lama (bulan): ");
        lamaBulan = inputan.nextInt();

        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            String formattedsaldoAwal = decimalFormat.format(saldoAwal);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + formattedsaldoAwal);
        }
    
    }
}
