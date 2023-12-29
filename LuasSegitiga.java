import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        hitungLuasSegitiga();
    }

    public static void hitungLuasSegitiga() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang alas segitiga: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = scanner.nextDouble();

            if (alas <= 0 || tinggi <= 0) {
                System.out.println("Panjang alas dan ticnggi harus lebih dari 0");
            } else {
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas segitiga adalah: " + luasSegitiga);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Masukkan angka yang valid untuk panjang alas dan tinggi");
        }
    }
}