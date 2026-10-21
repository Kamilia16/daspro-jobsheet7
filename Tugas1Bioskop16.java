import java.util.Scanner;
public class Tugas1Bioskop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.println("=== Penjualan Tiket Bioskop (ketik 0 untuk selesai) ===");

        do {
            System.out.println("Jumlah tiket yang dibeli pelanggan:");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0 ) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }
            double harga = jumlahTiket * hargaTiket;
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            double bayar = harga - (harga * diskon);
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar pelanggan: Rp" + (long) bayar);

            totalTiket += jumlahTiket;
            totalPenjualan += bayar;
        } while (jumlahTiket != 0);
        System.out.println("------------------------------------");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + (long) totalPenjualan);

        sc.close();
        }
    }
