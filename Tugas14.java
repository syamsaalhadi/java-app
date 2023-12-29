import java.util.Scanner;

public class Tugas14 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca masukan dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta dan membaca masukan nama depan
        System.out.print("Nama Depan: ");
        String namaDepan = scanner.nextLine();

        // Meminta dan membaca masukan nama belakang
        System.out.print("Nama Belakang: ");
        String namaBelakang = scanner.nextLine();

        // Meminta dan membaca masukan alamat
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();

        // Meminta dan membaca masukan tempat lahir
        System.out.print("Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        // Meminta dan membaca masukan tanggal lahir
        System.out.print("Tanggal Lahir: ");
        String tanggalLahir = scanner.nextLine();

        // Menggunakan try-catch untuk menangani kesalahan jika masukan usia bukan angka
        int usia = 0;
        try {
            // Meminta dan membaca masukan usia
            System.out.print("Usia: ");
            usia = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Masukan usia tidak valid. Program berhenti.");
            // Menutup objek Scanner
            scanner.close();
            return;
        }

System.out.println("");
        // Menampilkan Nama Lengkap
        System.out.println("Nama Lengkap: " + namaDepan + " " + namaBelakang);

        // Menampilkan Alamat
        System.out.println("Alamat: " + alamat);

        // Menampilkan Tempat/Tanggal Lahir
        System.out.println("Tempat/Tanggal Lahir: " + tempatLahir + " " + tanggalLahir);

        // Menampilkan Usia
        System.out.println("Usia: " + usia + " tahun");

        // Menutup objek Scanner
        scanner.close();
    }
}
