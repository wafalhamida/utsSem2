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
public class DenahKelas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat array 2 dimensi 5x5
        int[][] kursi = new int[5][5];

        // =====================================
        // MENAMPILKAN DENAH AWAL
        // =====================================
        System.out.println("DENAH KURSI SEBELUM DIISI");
        tampilkanDenah(kursi);

        // =====================================
        // INPUT JUMLAH KURSI YANG AKAN DIISI
        // =====================================
        System.out.print("\nBerapa kursi yang ingin diisi? ");
        int jumlah = input.nextInt();

        // =====================================
        // MENGISI KURSI
        // =====================================
        for (int i = 1; i <= jumlah; i++) {

            System.out.println("\nInput kursi ke-" + i);

            System.out.print("Masukkan baris (0-4): ");
            int baris = input.nextInt();

            System.out.print("Masukkan kolom (0-4): ");
            int kolom = input.nextInt();

            // Mengecek apakah kursi sudah terisi
            if (kursi[baris][kolom] == 1) {
                System.out.println("Kursi sudah terisi!");
            } else {
                kursi[baris][kolom] = 1;
                System.out.println("Kursi berhasil diisi.");
            }
        }

        // =====================================
        // MENAMPILKAN DENAH SETELAH DIISI
        // =====================================
        System.out.println("\nDENAH KURSI SESUDAH DIISI");
        tampilkanDenah(kursi);

        // =====================================
        // MENGHITUNG JUMLAH KURSI
        // =====================================
        int kosong = 0;
        int terisi = 0;

        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {

                if (kursi[i][j] == 0) {
                    kosong++;
                } else {
                    terisi++;
                }
            }
        }

        // =====================================
        // MENAMPILKAN HASIL
        // =====================================
        System.out.println("\nJumlah Kursi Kosong : " + kosong);
        System.out.println("Jumlah Kursi Terisi : " + terisi);

        input.close();
    }

    // Method menampilkan denah
    public static void tampilkanDenah(int[][] kursi) {

        for (int i = 0; i < kursi.length; i++) {

            for (int j = 0; j < kursi[i].length; j++) {
                System.out.print(kursi[i][j] + " ");
            }

            System.out.println();
        }
    }
}