import java.util.Scanner;

public class RekruitmenKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai tes akademik, ketrampilan, dan psikologi
        System.out.print("Masukkan nilai tes akademik: ");
        int nilaiAkademik = scanner.nextInt();

        System.out.print("Masukkan nilai tes ketrampilan: ");
        int nilaiKetrampilan = scanner.nextInt();

        System.out.print("Masukkan nilai tes psikologi: ");
        int nilaiPsikologi = scanner.nextInt();

        // Batas minimal rata-rata untuk lulus
        int batasLulus = 75;

        // Cek apakah pelamar lulus berdasarkan rata-rata nilai
        if ((nilaiAkademik + nilaiKetrampilan + nilaiPsikologi) / 3 >= batasLulus) {
            System.out.println("Diterima!");

            // Menentukan penempatan berdasarkan nilai tes
            if (nilaiAkademik > nilaiKetrampilan && nilaiAkademik > nilaiPsikologi) {
                System.out.println("Ditempatkan di bagian Administrasi.");
            } else if (nilaiKetrampilan > nilaiAkademik && nilaiKetrampilan > nilaiPsikologi) {
                System.out.println("Ditempatkan di bagian Produksi.");
            } else {
                System.out.println("Ditempatkan di bagian Pemasaran.");
            }
        } else {
            System.out.println("Tidak diterima.");
        }

        
        scanner.close();
    }
}
