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
public class SortingHargaProduk {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================
        // ARRAY NAMA BARANG
        // =========================
        String[] barang = new String[10];

        // =========================
        // ARRAY HARGA BARANG
        // =========================
        int[] harga = new int[10];

        // =========================
        // INPUT DATA PRODUK
        // =========================
        System.out.println("=== INPUT DATA PRODUK ===");

        for (int i = 0; i < 10; i++) {

            System.out.print("Masukkan nama barang ke-" + (i + 1) + " : ");
            barang[i] = input.nextLine();

            System.out.print("Masukkan harga barang : ");
            harga[i] = input.nextInt();
            input.nextLine();

            System.out.println();
        }

        // =========================
        // DATA SEBELUM SORTING
        // =========================
        System.out.println("\n=== DATA SEBELUM SORTING ===");

        for (int i = 0; i < 10; i++) {

            System.out.println(
                    barang[i] + " - Rp" + harga[i]);
        }

        // =========================
        // BUBBLE SORT
        // =========================
        for (int i = 0; i < 10 - 1; i++) {

            for (int j = 0; j < 10 - i - 1; j++) {

                // Membandingkan harga
                if (harga[j] > harga[j + 1]) {

                    // Tukar harga
                    int tempHarga = harga[j];
                    harga[j] = harga[j + 1];
                    harga[j + 1] = tempHarga;

                    // Tukar nama barang
                    String tempBarang = barang[j];
                    barang[j] = barang[j + 1];
                    barang[j + 1] = tempBarang;
                }
            }
        }

        // =========================
        // DATA SETELAH SORTING
        // =========================
        System.out.println("\n=== DATA SETELAH SORTING ===");

        for (int i = 0; i < 10; i++) {

            System.out.println(
                    barang[i] + " - Rp" + harga[i]);
        }

        // =========================
        // PENJELASAN ALGORITMA
        // =========================
        System.out.println("\n=== PENJELASAN ALGORITMA ===");

        System.out.println("Program menggunakan");
        System.out.println("algoritma Bubble Sort.");

        System.out.println("\nLangkah kerja Bubble Sort:");

        System.out.println("1. Membandingkan dua data");
        System.out.println("   yang bersebelahan.");

        System.out.println("2. Jika data kiri lebih besar,");
        System.out.println("   maka data ditukar.");

        System.out.println("3. Proses dilakukan terus");
        System.out.println("   sampai seluruh data urut.");

        System.out.println("\nPada program ini,");
        System.out.println("harga produk diurutkan");
        System.out.println("dari termurah ke termahal.");
        System.out.println("mengapa menggunakan Bubble short?");
        System.out.println("dikarenakan menurut saya lebih mudah menggunakannya dalam program ini");

        input.close();
    }
}
