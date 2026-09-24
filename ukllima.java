import java.util.Scanner;

public class ukllima {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
          System.out.println("PROGRAM RATA-RATA NILAI SISWA");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
         double total = 0;
         
          for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            total += input.nextDouble();
        }

        double rata = total / jumlah;
        System.out.println("Rata-rata nilai siswa = " + rata);
    }
    }
    

