import java.util.Scanner;

public class uklnodua {
     Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang ingin dipecahkan: ");
        int jumlahUang = input.nextInt();

        int[] uangKertas = {100000, 50000, 20000, 10000, 5000, 2000, 1000};
        int[] koin = {500, 200, 100, 50};

        System.out.println("Hasil pecahan:");

        for (int p : uangKertas) {
            int banyak = jumlahUang / p;
            if (banyak > 0) {
                System.out.println(banyak + " Lembar Rp " + p);
                jumlahUang %= p;
            }
        }

        for (int p : koin) {
            int banyak = jumlahUang / p;
            if (banyak > 0) {
                System.out.println(banyak + " Koin Rp " + p);
                jumlahUang %= p;
            }
        }
        if (jumlahUang > 0) {
            System.out.println("Sisa tidak bisa dibagi: Rp " + jumlahUang);
        }

        
        
    }
}
