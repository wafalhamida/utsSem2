/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsSem2;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Zila
 */
public class AntreanRestoran {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat Queue
        Queue<String> antrian = new LinkedList<>();

        // =========================
        // INPUT TANGGAL SEKALI SAJA
        // =========================
        System.out.print("Masukkan tanggal pemesanan : ");
        String tanggal = input.nextLine();

        int pilihan;

        do {

            // =========================
            // MENU PROGRAM
            // =========================
            System.out.println("\n===== SISTEM ANTREAN RESTORAN =====");
            System.out.println("Tanggal Pemesanan : " + tanggal);
            System.out.println("1. Tambah Data Pesanan");
            System.out.println("2. Tampilkan Daftar Antrean");
            System.out.println("3. Proses Pesanan Pertama");
            System.out.println("4. Tampilkan Antrean Setelah Proses");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                // =========================
                // MENU 1
                // TAMBAH PESANAN
                // =========================
                case 1:

                    System.out.println("\n=== TAMBAH DATA PESANAN ===");
                    System.out.println("Tanggal : " + tanggal);

                    System.out.print("Masukkan nama pelanggan : ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan pesanan : ");
                    String pesanan = input.nextLine();

                    // Menyimpan data ke Queue
                    String data =
                            "Tanggal : " + tanggal +
                            " | Nama : " + nama +
                            " | Pesanan : " + pesanan;

                    antrian.add(data);

                    System.out.println("Pesanan berhasil ditambahkan!");
                    break;

                // =========================
                // MENU 2
                // TAMPILKAN ANTREAN
                // =========================
                case 2:

                    System.out.println("\n=== DAFTAR ANTREAN ===");
                    System.out.println("Tanggal : " + tanggal);

                    if (antrian.isEmpty()) {

                        System.out.println("Antrean masih kosong.");

                    } else {

                        int nomor = 1;

                        for (String tampil : antrian) {

                            System.out.println(
                                    nomor + ". " + tampil);

                            nomor++;
                        }
                    }

                    break;

                // =========================
                // MENU 3
                // PROSES PESANAN PERTAMA
                // =========================
                case 3:

                    System.out.println("\n=== PROSES PESANAN ===");
                    System.out.println("Tanggal : " + tanggal);

                    if (antrian.isEmpty()) {

                        System.out.println("Tidak ada antrean.");

                    } else {

                        // Menghapus antrean pertama
                        String proses = antrian.poll();

                        System.out.println(
                                "Pesanan yang diproses : ");
                        System.out.println(proses);
                    }

                    break;

                // =========================
                // MENU 4
                // TAMPILKAN ANTREAN
                // SETELAH PROSES
                // =========================
                case 4:

                    System.out.println(
                            "\n=== ANTREAN SETELAH PROSES ===");

                    System.out.println("Tanggal : " + tanggal);

                    if (antrian.isEmpty()) {

                        System.out.println("Antrean kosong.");

                    } else {

                        int nomor = 1;

                        for (String tampil : antrian) {

                            System.out.println(
                                    nomor + ". " + tampil);

                            nomor++;
                        }
                    }

                    break;

                // =========================
                // MENU 5
                // KELUAR
                // =========================
                case 5:

                    System.out.println("\nProgram selesai.");
                    break;

                default:

                    System.out.println(
                            "\nPilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
   