import java.util.Scanner;

public class KantinMoklet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("LIST Kantin Moklet :");
        System.out.println("1. GadoGado (9500)");
        System.out.println("2. Ayam Geprek (13000)");
        System.out.println("3. Soto (15500)");
        System.out.println("4. Mie Ayam (8000)");
        System.out.println("5. Snack Basreng (5000)");
        System.out.println("====================");

        
        System.out.print("Masukkan pilihan = ");
        int pilihan = input.nextInt();

        
        System.out.print("Jumlah = ");
        int jumlah = input.nextInt();

        int harga = 0;

        
        switch (pilihan) {
            case 1:
                harga = 9500;
                break;
            case 2:
                harga = 13000;
                break;
            case 3:
                harga = 15500;
                break;
            case 4:
                harga = 8000;
                break;
            case 5:
                harga = 5000;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0); 
                
        }

        
        int total = harga * jumlah;

        
        double diskon = 0;
        if (total >= 50000) {
            diskon = total * 0.1;
        }   

        double totalBayar = total - diskon;

        
        System.out.print("Uang yang dibayar = ");
        double bayar = input.nextDouble();
        if (bayar < totalBayar) {
            System.out.println("Maaf, uang anda kurang.");
            System.out.println("Transaksi dibatalkan.");
        } else {

    
        double kembalian = bayar - totalBayar;

        
        System.out.println("====================");
        System.out.println("Total harga     = " + total);
        System.out.println("Diskon          = " + diskon);
        System.out.println("Total Bayar     = " + totalBayar);
        System.out.println("Uang dibayar    = " + bayar);
        System.out.println("Kembalian       = " + kembalian);
        System.out.println("Terima Kasih Sudah Berbelanja");
    }
}
}
