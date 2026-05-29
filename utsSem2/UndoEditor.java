/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsSem2;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Zila
 */
public class UndoEditor {
   
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat struktur data Stack
        Stack<String> aksi = new Stack<>();

        // =========================
        // INPUT JUMLAH AKSI
        // =========================
        int jumlah;

        do {
            System.out.print("Masukkan jumlah aksi (minimal 5) : ");
            jumlah = input.nextInt();
            input.nextLine();

            if (jumlah < 5) {
                System.out.println("Jumlah aksi harus minimal 5!\n");
            }

        } while (jumlah < 5);

        // =========================
        // PROSES PUSH
        // =========================
        System.out.println("\n=== PROSES PUSH ===");

        for (int i = 1; i <= jumlah; i++) {

            System.out.print("Masukkan aksi ke-" + i + " : ");
            String data = input.nextLine();

            // Menyimpan aksi ke stack
            aksi.push(data);

            System.out.println("Push berhasil : " + data);
            System.out.println("Isi Stack : " + aksi);
            System.out.println();
        }

        // =========================
        // PROSES UNDO BERULANG
        // =========================
        String pilihan;

        do {

            System.out.print("\nApakah ingin melakukan undo? (ya/tidak) : ");
            pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("ya")) {

                // Mengecek stack kosong atau tidak
                if (!aksi.isEmpty()) {

                    System.out.println("\n=== PROSES POP / UNDO ===");

                    // Menghapus aksi terakhir
                    String undo = aksi.pop();

                    System.out.println("Aksi yang dibatalkan : " + undo);

                    // Menampilkan isi stack terbaru
                    System.out.println("Isi Stack Sekarang : ");
                    System.out.println(aksi);

                } else {

                    System.out.println("Stack kosong, tidak ada aksi untuk di-undo.");
                }
            }

        } while (pilihan.equalsIgnoreCase("ya"));

        // =========================
        // PENJELASAN STACK
        // =========================
        System.out.println("\n=== PENJELASAN ===");

        System.out.println("Struktur data Stack cocok digunakan");
        System.out.println("pada fitur undo karena menggunakan");
        System.out.println("konsep LIFO (Last In First Out).");

        System.out.println("\nArtinya, aksi terakhir yang masuk");
        System.out.println("ke Stack akan menjadi aksi pertama");
        System.out.println("yang dibatalkan.");

        input.close();
    }
}