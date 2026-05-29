/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsSem2;
import java.util.Scanner;
/**
 *
 * @author Zila
 */
public class PenjualanMinimarket {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Jumlah produk
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = input.nextInt();
        input.nextLine();

        // Array
        String[] namaProduk = new String[jumlahProduk];
        int[] harga = new int[jumlahProduk];
        int[][] penjualan = new int[jumlahProduk][7];

        // =========================
        // INPUT DATA
        // =========================
        for (int i = 0; i < jumlahProduk; i++) {

            System.out.println("\nProduk ke-" + (i + 1));

            System.out.print("Nama produk : ");
            namaProduk[i] = input.nextLine();

            System.out.print("Harga produk : ");
            harga[i] = input.nextInt();

            // Input penjualan 7 hari
            for (int j = 0; j < 7; j++) {

                System.out.print("Penjualan hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = input.nextInt();
            }

            input.nextLine();
        }

        // =========================
        // MENAMPILKAN TABEL
        // =========================
        System.out.println("\n===== DATA PENJUALAN =====");

        System.out.print("Produk\t\t");

        for (int i = 1; i <= 7; i++) {
            System.out.print("H" + i + "\t");
        }

        System.out.println("Total");

        int terbesar = 0;
        String produkTerlaris = "";

        // Menampilkan data
        for (int i = 0; i < jumlahProduk; i++) {

            System.out.print(namaProduk[i] + "\t\t");

            int total = 0;

            for (int j = 0; j < 7; j++) {

                System.out.print(penjualan[i][j] + "\t");

                total += penjualan[i][j];
            }

            System.out.println(total);

            // Cek produk terlaris
            if (total > terbesar) {
                terbesar = total;
                produkTerlaris = namaProduk[i];
            }
        }

        // =========================
        // TOTAL PENDAPATAN
        // =========================
        System.out.println("\n===== TOTAL PENDAPATAN =====");

        for (int i = 0; i < jumlahProduk; i++) {

            int totalPenjualan = 0;

            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }

            int pendapatan = totalPenjualan * harga[i];

            System.out.println(
                namaProduk[i] +
                " = Rp " + pendapatan
            );
        }

        // =========================
        // PRODUK TERLARIS
        // =========================
        System.out.println("\nProduk dengan penjualan tertinggi: "
                + produkTerlaris);

        System.out.println("Jumlah penjualan: " + terbesar);

        input.close();
    }
}
