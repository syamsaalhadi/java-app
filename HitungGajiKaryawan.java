import java.util.Scanner;

public class HitungGajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jam kerja per minggu
        System.out.print("Masukkan jumlah jam kerja per minggu: ");
        int jamKerja = scanner.nextInt();

        // Menentukan upah per jam
        int upahPerJam = 5000;

        // Batasan jam kerja normal
        int batasMinJamKerja = 50;
        int batasMaxJamKerja = 60;

        // Upah tambahan dan potongan
        int upahTambahanPerJam = 7500;
        int potonganPerJam = 2500;

        // Menghitung total gaji
        int totalGaji = 0;

        if (jamKerja >= batasMinJamKerja && jamKerja <= batasMaxJamKerja) {
            // Jam kerja normal
            totalGaji = jamKerja * upahPerJam;
        } else if (jamKerja > batasMaxJamKerja) {
            // Jam kerja lebih dari batas maksimum
            totalGaji = batasMaxJamKerja * upahPerJam + (jamKerja - batasMaxJamKerja) * upahTambahanPerJam;
        } else if (jamKerja < batasMinJamKerja) {
            // Jam kerja kurang dari batas minimum
            totalGaji = jamKerja * (upahPerJam - potonganPerJam);
        }

        // Output total gaji
        System.out.println("Total gaji karyawan: Rp " + totalGaji);

        
        scanner.close();
    }
}
