import java.util.Scanner;

public class Tugas26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // memasukkan dua bilangan
        System.out.print("Bilangan 1 = ");
        double bilangan1 = scanner.nextDouble();

        System.out.print("Bilangan 2 = ");
        double bilangan2 = scanner.nextDouble();

        // Menampilkan hasil operasi aritmatika
        System.out.println("\nHasil Operasi Aritmatika:");

        // Penjumlahan
        double hasilPenjumlahan = bilangan1 + bilangan2;
        System.out.println("Penjumlahan: " + Math.round(hasilPenjumlahan));

        // Pengurangan
        double hasilPengurangan = bilangan1 - bilangan2;
        System.out.println("Pengurangan : " + Math.round(hasilPengurangan));

        // Perkalian
        double hasilPerkalian = bilangan1 * bilangan2;
        System.out.println("Perkalian  : " + Math.round(hasilPerkalian));

        // Menangani pembagian dengan memastikan tidak ada pembagian oleh nol
        if (bilangan2 != 0) {
            System.out.println("Pembagian  : " + (bilangan1 / bilangan2));
        } else {
            System.out.println("Pembagian oleh 0 tidak valid.");
        }

        scanner.close();
    }
}
