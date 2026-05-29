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
public class SortingMahasiswa {
    
    // =========================
    // METHOD BUBBLE SORT
    // =========================
    public static void bubbleSort(String[] data) {

        int n = data.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Membandingkan alfabet
                if (data[j].compareToIgnoreCase(data[j + 1]) > 0) {

                    // Tukar data
                    String temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // =========================
    // METHOD SELECTION SORT
    // =========================
    public static void selectionSort(String[] data) {

        int n = data.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                // Cari data terkecil
                if (data[j].compareToIgnoreCase(data[minIndex]) < 0) {

                    minIndex = j;
                }
            }

            // Tukar data
            String temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    // =========================
    // METHOD INSERTION SORT
    // =========================
    public static void insertionSort(String[] data) {

        int n = data.length;

        for (int i = 1; i < n; i++) {

            String key = data[i];
            int j = i - 1;

            // Geser data
            while (j >= 0 &&
                    data[j].compareToIgnoreCase(key) > 0) {

                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
    }

    // =========================
    // METHOD TAMPIL DATA
    // =========================
    public static void tampilData(String[] data) {

        for (String nama : data) {

            System.out.println(nama);
        }
    }

    // =========================
    // MAIN PROGRAM
    // =========================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        // Array nama mahasiswa
        String[] mahasiswa = new String[jumlah];

        // Input nama mahasiswa
        System.out.println("\n=== INPUT NAMA MAHASISWA ===");

        for (int i = 0; i < jumlah; i++) {

            System.out.print("Masukkan nama mahasiswa ke-" +
                    (i + 1) + " : ");

            mahasiswa[i] = input.nextLine();
        }

        // Membuat salinan array
        String[] bubble = mahasiswa.clone();
        String[] selection = mahasiswa.clone();
        String[] insertion = mahasiswa.clone();

        // =========================
        // DATA SEBELUM SORTING
        // =========================
        System.out.println("\n=== DATA SEBELUM SORTING ===");

        tampilData(mahasiswa);

        // =========================
        // BUBBLE SORT
        // =========================
        bubbleSort(bubble);

        System.out.println("\n=== HASIL BUBBLE SORT ===");

        tampilData(bubble);

        // =========================
        // SELECTION SORT
        // =========================
        selectionSort(selection);

        System.out.println("\n=== HASIL SELECTION SORT ===");

        tampilData(selection);

        // =========================
        // INSERTION SORT
        // =========================
        insertionSort(insertion);

        System.out.println("\n=== HASIL INSERTION SORT ===");

        tampilData(insertion);

        // =========================
        // PERBANDINGAN
        // =========================
        System.out.println("\n=== PERBANDINGAN ALGORITMA ===");

        System.out.println("1. Bubble Sort");
        System.out.println("   Membandingkan dua data");
        System.out.println("   yang bersebelahan lalu");
        System.out.println("   menukarnya jika salah urutan.");

        System.out.println("\n2. Selection Sort");
        System.out.println("   Mencari data terkecil");
        System.out.println("   lalu menukarnya ke posisi depan.");

        System.out.println("\n3. Insertion Sort");
        System.out.println("   Menyisipkan data ke");
        System.out.println("   posisi yang sesuai.");

        input.close();
    }
}
