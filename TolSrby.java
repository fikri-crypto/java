import java.util.Scanner;

public class TolSrby {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan gerbang tol");
        System.out.println("1.Malang - Surabaya = 35.000");
        System.out.println("2.Malang - Pandaan = 20.000");
        System.out.println("3.Surabaya - Gempol = 25.000");
        System.out.println("4.Pandaan - Pasuruan = 15.000");
        System.out.println("======================================");
        System.out.println("Input pilihan gerbang tol");
        int pihianGerbang = input.nextInt();
        String rute = "";
        double tarifDasar = 0.0;
    
    
        switch (pihianGerbang) {
            case 1:
            rute = "Malang - Surabaya";
            tarifDasar = 35000.0;
                
                break;
                case 2:
                rute = "Malang - Pandaan";
                tarifDasar = 20000.0;
                break;
                case 3:
                rute = "Surabaya - Gempol";
                tarifDasar = 25000.0;
                break;
                case 4:
                rute = "Pandaan - Pasuruan";
                tarifDasar = 15000.0;
                break;
        
            default:
                System.out.println("pilihan tidak valid");
                System.exit(0);
                return;
        }
        System.out.println("Golongan kendaraan");
        System.out.println("1 - Mobil / Jeep / Sedan - x1");
        System.out.println("2 - truk kecil / bus - x1.5");
        System.out.println("3 - truk besar / kontainer - x2");
        System.out.println("==============");
        System.out.println("Input golongan kendaraan");
        int golkendaraan = input.nextInt();
        String jenisKendaraan;
        double faktortarif;
        switch (golkendaraan) {
            case 1:
            jenisKendaraan = "Mobil / Jeep / Sedan";
            faktortarif = 1;
                
                break;
                case 2:
                jenisKendaraan = "truk kecil / bus";
                faktortarif = 1.5;
                break;
                case 3:
                jenisKendaraan = "truk besar / kontainer";
                faktortarif = 2;
                break;
        
            default:
            System.out.println("pilihan tidak valid");
            System.exit(0);
                return;
        }
        System.out.println("Metode Pembayaran");
        System.out.println("1. E-Toll (Diskon 10%)");
        System.out.println("2. Tunai (Tidak ada diskon)");
        System.out.println("3. Kredit (Diskon 5%)");
        System.out.println("========================");
        System.out.println("Input metode pembayaran");
        int metodePembayaran = input.nextInt();
        String metode;
        double diskon;
        switch (metodePembayaran) {
            case 1:
            metode = "E-Toll";
            diskon = 0.1;
                
                break;
                case 2:
                metode = "Tunai";
                diskon = 0;
                break;
                case 3:
                metode = "Kredit";
                diskon = 0.05;
                break;
        
            default:
            System.out.println("pilihan tidak valid");
            System.exit(0);
                return;
        }
       System.out.println("Input kondisi perjalanan (misal: 1 2 jika dua-duanya):");
input.nextLine(); // membersihkan buffer
String kondisiInput = input.nextLine();
String kondisi = "";
double tambahanTarif = 0.0;

if (kondisiInput.contains("1")) {
    kondisi += "Jam perjalanan 22.00 - 05.00; ";
    tambahanTarif += 5000.0;
}
if (kondisiInput.contains("2")) {
    kondisi += "Jarak tempuh > 50km; ";
    tambahanTarif += 10000.0;
}

        // Hitung total bayar
        double totalbayar = (tarifDasar * faktortarif + tambahanTarif) * (1 - diskon);

        System.out.println("Total Bayar: " + totalbayar);
        System.out.println("Rute: " + rute);
        System.out.println("Jenis Kendaraan: " + jenisKendaraan);
        System.out.println("Metode Pembayaran: " + metode);
        System.out.println("Kondisi Perjalanan: " + kondisi);
        System.out.println("Terima kasih telah menggunakan layanan kami.");

        
        
            
    }
    }

