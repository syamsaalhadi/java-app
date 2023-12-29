import java.util.Scanner;

public class HitungDiskonBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = scanner.nextDouble();

       
        System.out.print("Masukkan jumlah transaksi: ");
        int nomorTransaksi = scanner.nextInt();

        
        double batasDiskon10 = 50000;

        
        double diskon10Persen = 0.1;
        double diskon5Persen = 0.05;

        
        double potongan = 0;

        if (totalBelanja > batasDiskon10) {
            potongan += totalBelanja * diskon10Persen;

            
            if (nomorTransaksi <= 50) {
                potongan += totalBelanja * diskon5Persen;
            }
        }

        
        double totalPembayaran = totalBelanja - potongan;

        
        System.out.println("Potongan: Rp " + potongan);
        System.out.println("Jumlah yang harus dibayar: Rp " + totalPembayaran);

        
        scanner.close();
    }
}
