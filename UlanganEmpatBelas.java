import java.util.Scanner;
public class UlanganEmpatBelas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Halo, ingin sewa motor?");
        System.out.println("===================");


        System.out.println("Masukkan jumlah hari=");
        int Jumlah = input.nextInt();
       double HargaSewa = 75000;

       System.out.println("Total Biaya adalah "+ Jumlah*HargaSewa );




    }
}

