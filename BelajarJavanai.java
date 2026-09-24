import java.util.Scanner;

 public class BelajarJavanai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar menu dan harga
        String[] menu = {"Nasi Goreng", "Mie Ayam", "Sate Ayam", "Bakso"};
        int[] harga = {15000, 12000, 10000, 10000};

        // menunya
        System.out.println("Menu Restoran:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        // jumlah pesanan  
        int total = 0;
        System.out.print("Masukkan jumlah jenis makanan yang ingin dipesan: ");
        int jumlahJenis = scanner.nextInt();
        

        for (int i = 0; i < jumlahJenis; i++) {
            System.out.print("Pilih nomor menu: ");
            int pilihan = scanner.nextInt();
            System.out.print("Jumlah porsi: ");
            int porsi = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= menu.length) {
                int subtotal = harga[pilihan - 1] * porsi;
                total += subtotal;
                System.out.println(menu[pilihan - 1] + " x " + porsi + " = Rp" + subtotal);
            } else {
                System.out.println("Nomor menu tidak valid.");
            }
        }

        System.out.println("Total harga: Rp" + total);
        scanner.close();
    }
}
