import java.util.Scanner;

public class dasarOperator {
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Bilangan 1 :");
        int bil1 = input.nextInt();
        System.out.print("Masukkan Bilangan 2 :");
        int bil2 = input.nextInt();
        int hasilJumlah = bil1 + bil2;
        System.out.println("Bilangan 1: " + bil1 + ", Bilangan 2: " + bil2);
        System.out.println("Hasil Penjumlahan kedua bilangan: " + hasilJumlah);
        int hasilPengurangan = bil1 - bil2;
    int hasilPerkalian = bil1 * bil2;
        int hasilPembagian = bil1 / bil2;
        int hasilPenjumlahan = bil1 + bil2;

        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
      
    }
}
        
     
    

