import java.util.Scanner;
public class TolMalang {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeTol, golongan, metode, jam, jarak;
        double tarifDasar = 0, faktor = 1, diskon = 0, totalBiaya, biayaTambahan = 0;

        // Ini pilihan gerbang tol
        System.out.println("Pilih Gerbang Tol:");
        System.out.println("1. Malang - Surabaya (Rp 35.000)");
        System.out.println("2. Malang - Pandaan (Rp 20.000)");
        System.out.println("3. Surabaya - Gempol (Rp 25.000)");
        System.out.println("4. Pandaan - Pasuruan (Rp 15.000)");
        System.out.print("Masukkan kode: ");
        kodeTol = input.nextInt();

        switch (kodeTol) {
            case 1: tarifDasar = 35000; break;
            case 2: tarifDasar = 20000; break;
            case 3: tarifDasar = 25000; break;
            case 4: tarifDasar = 15000; break;
            default: System.out.println("Kode tidak valid!"); return;
        }

        // Pilih golongan kendaraan
        System.out.println("Pilih Golongan Kendaraan:");
        System.out.println("1. Mobil / Jeep / Sedan (x1)");
        System.out.println("2. Truk kecil / Bus (x1.5)");
        System.out.println("3. Truk besar / Kontainer (x2)");
        System.out.print("Masukkan kode: ");
        golongan = input.nextInt();

        switch (golongan) {
            case 1: faktor = 1; break;
            case 2: faktor = 1.5; break;
            case 3: faktor = 2; break;
            default: System.out.println("Kode tidak valid!"); return;
        }

        // Pilih metode pembayaran
        System.out.println("\nPilih Metode Pembayaran:");
        System.out.println("1. E-Toll (Diskon 10%)");
        System.out.println("2. Tunai (Diskon 0%)");
        System.out.println("3. Kartu Kredit (Diskon 5%)");
        System.out.print("Masukkan kode: ");
        metode = input.nextInt();

        switch (metode) {
            case 1: diskon = 0.10; break;
            case 2: diskon = 0; break;
            case 3: diskon = 0.05; break;
            default: System.out.println("Kode tidak valid!"); return;
        }

        // Kondisi tambahan
        System.out.print("\nMasukkan jam perjalanan (0-23): ");
        jam = input.nextInt();
        if (jam >= 22 || jam < 5) {
            biayaTambahan += 5000;
        }

        System.out.print("Masukkan jarak tempuh (km): ");
        jarak = input.nextInt();
        if (jarak > 50) {
            biayaTambahan += 10000;
        }

        // Hitung total biaya
        totalBiaya = (tarifDasar * faktor) - (tarifDasar * faktor * diskon) + biayaTambahan;

        // Output
        System.out.println("\n===== Rincian Pembayaran =====");
        System.out.println("Tarif dasar          : Rp " + tarifDasar);
        System.out.println("Faktor kendaraan     : x" + faktor);
        System.out.println("Metode pembayaran    : " + (metode == 1 ? "E-Toll" : (metode == 2 ? "Tunai" : "Kartu Kredit")));
        System.out.println("Diskon               : " + (diskon * 100) + "%");
        System.out.println("Biaya tambahan       : Rp " + biayaTambahan);
        System.out.println("Total yang harus dibayar: Rp " + totalBiaya);
    }
}


